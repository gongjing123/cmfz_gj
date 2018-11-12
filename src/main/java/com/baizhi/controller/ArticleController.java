package com.baizhi.controller;

import com.baizhi.entity.Article;
import com.baizhi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    //-------------分页查询----------------
    @RequestMapping("/findAll")
    public @ResponseBody
    Map<String,Object> findAll(Integer page, Integer rows){
        Map<String,Object> results = new HashMap<String,Object>();
        //当前页数据rows:
        List<Article> titlePics = articleService.findByPage(page, rows);
        //总记录数
        Long totals = articleService.findTotals();
        results.put("total",totals);
        results.put("rows",titlePics);
        return results;
    }

    @RequestMapping("/remove")
    //------------------------------------删除一行--------------
    public  @ResponseBody void  remove(String id){
        articleService.remove(id);
    }


    //------------------------------------添加--------------
    @RequestMapping("/add")
    public @ResponseBody Map<String,Object> add(Article article, MultipartFile file, HttpServletRequest request)  {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        //获取上传路径  相对路径 files    获取绝对路径
        String realPath = request.getSession().getServletContext().getRealPath("/back/article/image");
        article.setInsertimgPath("/article/image/"+file.getOriginalFilename());

        Map<String,Object> results = new HashMap<String,Object>();
        try{
            System.out.println(article);
            articleService.add(article);
            results.put("success",true);
            //上传
            file.transferTo(new File(realPath,file.getOriginalFilename()));
        }catch (Exception e){
            e.printStackTrace();
            results.put("success",false);
            results.put("message",e.getMessage());
        }
        return results;
    }



    @RequestMapping("/motify")
    //-------------------------------------修改----------------
    public void motify(Article article){

        System.out.println(article);
        articleService.motify(article);
    }

    @RequestMapping("/findOne")
    //-------------------------------------chazai
    public  @ResponseBody Article findOne(String id){

        Article one = articleService.findOne(id);

        return one;
    }
}
