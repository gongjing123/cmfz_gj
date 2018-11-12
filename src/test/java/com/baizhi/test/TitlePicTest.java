package com.baizhi.test;

import com.baizhi.entity.TitlePic;
import com.baizhi.service.TitlePicService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TitlePicTest extends  BaseTest {


    @Autowired
    private TitlePicService titlePicService;

    @Test
    public  void  test1(){

        List<TitlePic> byPage = titlePicService.findByPage(1, 2);
        System.out.println(byPage);


    }
    @Test
    public  void  test2(){

        Long totals = titlePicService.findTotals();
        System.out.println(totals);


    }
}
