package com.baizhi.test;


import com.baizhi.entity.Course;

import com.baizhi.service.CourseService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseTest extends  BaseTest {


    @Autowired
    private CourseService courseService;

    @Test
    public  void  test1(){

        List<Course> byPage = courseService.findAll(1,10);
        System.out.println(byPage);


    }
    @Test
    public  void  test2(){

        List<Course> byPage = courseService.findAll1(1,10);
        System.out.println(byPage);


    }

    @Test
    public  void  test3(){

        Long totals = courseService.findTotals();
        System.out.println(totals);


    }
}
