package com.baizhi.controller;

import com.baizhi.entity.TitlePic;
import com.baizhi.service.TitlePicService;
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
@RequestMapping("/TitlePic")
public class TitlePicController {

    @Autowired
    private TitlePicService titlePicService;

    //-------------分页查询----------------
    @RequestMapping("/findAll")
    public @ResponseBody
    Map<String,Object> findAll(Integer page, Integer rows){
        Map<String,Object> results = new HashMap<String,Object>();
        //当前页数据rows:
        List<TitlePic> titlePics = titlePicService.findByPage(page, rows);
        //总记录数
        Long totals = titlePicService.findTotals();
        results.put("total",totals);
        results.put("rows",titlePics);
        return results;
    }

    @RequestMapping("/remove")
    //------------------------------------删除一行--------------
    public  @ResponseBody void  remove(String id){
        titlePicService.remove(id);
    }

    @RequestMapping("/add")
    //------------------------------------添加--------------
    public    @ResponseBody
    Map<String,Object> add(TitlePic titlePic, MultipartFile file, HttpServletRequest request)  {
        //获取上传路径  相对路径 files    获取绝对路径
        String realPath = request.getSession().getServletContext().getRealPath("/back/TitlePic/image");
        titlePic.setPath("/TitlePic/image/"+file.getOriginalFilename());

        Map<String,Object> results = new HashMap<String,Object>();
        try{
            System.out.println(titlePic);
            titlePicService.add(titlePic);
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
    public @ResponseBody  void motify(TitlePic titlePic){


        titlePicService.motify(titlePic);
    }

    @RequestMapping("/findOne")
    //-------------------------------------chazai
    public  @ResponseBody TitlePic findOne(String id){
        TitlePic one = titlePicService.findOne(id);
        System.out.println(one);
        return one;
    }
}
