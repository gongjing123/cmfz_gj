package com.baizhi.controller;

import com.baizhi.entity.Guru;
import com.baizhi.service.GuruService;
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
@RequestMapping("/guru")
public class GuruController {

    @Autowired
    private GuruService guruService;
    //----------------分页查询-------------------------
    @RequestMapping("/findAll")
    public @ResponseBody
    Map<String,Object> findAll(Integer page, Integer rows){
        Map<String,Object> results = new HashMap<String,Object>();
        List<Guru> gurus = guruService.findByPage(page, rows);
        Long totals = guruService.findTotals();
        results.put("total",totals);
        results.put("rows",gurus);
        return  results;

    }
    //-------------添加------------------
    @RequestMapping("add")
    public    @ResponseBody
    Map<String,Object> add(Guru guru, MultipartFile file, HttpServletRequest request){
        String realPath = request.getSession().getServletContext().getRealPath("/back/guru/image");
        guru.setHeadPic("/guru/image/"+file.getOriginalFilename());


        Map<String,Object> results = new HashMap<String,Object>();
        try{
            System.out.println(guru);
            guruService.add(guru);
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

    //-------------删除------------------------------
    @RequestMapping("/remove")
    public @ResponseBody
    void remove(String id){
        guruService.remove(id);
    }
    //---------查询单个--------------------------
    @RequestMapping("/findOne")
    public @ResponseBody Guru findOne(String id){
        Guru one = guruService.findOne(id);
        return one;
    }
    //---------------修改-------------------
    @RequestMapping("/motify")
    public @ResponseBody void motify(Guru guru){

        System.out.println(guru);
        guruService.motify(guru);
    }


}
