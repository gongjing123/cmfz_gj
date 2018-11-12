package com.baizhi.controller;

import com.baizhi.entity.Course;
import com.baizhi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller

@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    //-------------分页查询----------------
    @RequestMapping("/findAll")
    public @ResponseBody
    Map<String,Object> findAll(Integer page, Integer rows){
        Map<String,Object> results = new HashMap<String,Object>();
        List<Course> courses = courseService.findAll(page, rows);
        Long totals = courseService.findTotals();
        results.put("total",totals);
        results.put("rows",courses);
        return results;
    }

    //-------------分页查询----------------
    @RequestMapping("/findAll1")
    public @ResponseBody
    Map<String,Object> findAll1(Integer page, Integer rows){
        Map<String,Object> results = new HashMap<String,Object>();
        List<Course> courses = courseService.findAll1(page, rows);
        Long totals = courseService.findTotals();
        results.put("total",totals);
        results.put("rows",courses);
        return results;
    }
    //-------------删除一行------------------------
    @RequestMapping("/remove")
    public  @ResponseBody void  remove(String id){
        courseService.remove(id);
    }


    //------------------------------------添加--------------
    @RequestMapping("/add")
    public @ResponseBody Map<String,Object> add(Course course)  {
        System.out.println("----------------------------");
        Map<String,Object> results = new HashMap<String,Object>();
        try{
            System.out.println(course);
            courseService.add(course);
            results.put("success",true);

        }catch (Exception e){
            e.printStackTrace();
            results.put("success",false);
            results.put("message",e.getMessage());
        }
        return results;
    }
    //--------------------------修改-------------------------------

    @RequestMapping("/motify")
    public @ResponseBody   Map<String,Object> motify(Course course){
        Map<String,Object> results = new HashMap<String,Object>();

        try {

            courseService.motify(course);
            results.put("success",true);
        }catch (Exception e){
            e.printStackTrace();
            results.put("success",false);
            results.put("message",e.getMessage());
        }
        return results;

    }

    //-------------------------------------查询单个--------
    @RequestMapping("/findOne")
    public  @ResponseBody Course findOne(String id){
        Course one = courseService.findOne(id);
        System.out.println(one);
        return one;
    }

}
