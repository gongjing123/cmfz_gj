package com.baizhi.controller;

import com.baizhi.entity.Album;
import com.baizhi.service.AlbumService;
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
@RequestMapping("/album")
public class AlbumController {
    @Autowired
    private AlbumService albumService;
    //-------------分页查询----------------
    @RequestMapping("/findAll")
    public @ResponseBody Map<String,Object> findAll(Integer page, Integer rows){
        Map<String,Object> results = new HashMap<String,Object>();
        List<Album> albums = albumService.findByPage(page, rows);
        Long totals = albumService.findTotals();
        results.put("total",totals);
        results.put("rows",albums);
        return results;
    }
    //-----------添加专辑-----------------
    @RequestMapping("/add")
    private @ResponseBody Map<String,Object> add(Album album , MultipartFile addFile, HttpServletRequest request){
        String realPath = request.getSession().getServletContext().getRealPath("/back/album/image");

        System.out.println(album);
        System.out.println(addFile);
        album.setCoverImg("/album/image/"+addFile.getOriginalFilename());
        System.out.println(album);
        Map<String,Object> results = new HashMap<String,Object>();


        try{
            albumService.add(album);
            results.put("success",true);
            //上传
            addFile.transferTo(new File(realPath,addFile.getOriginalFilename()));
        }catch (Exception e){
            e.printStackTrace();
            results.put("success",false);
            results.put("message",e.getMessage());
        }
        return results;
    }


}
