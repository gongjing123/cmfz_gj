package com.baizhi.test;

import com.baizhi.entity.Guru;
import com.baizhi.service.GuruService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GuruTest extends  BaseTest {


    @Autowired
    private GuruService guruService;

    @Test
    public  void  test1(){

        List<Guru> byPage = guruService.findByPage(1, 2);
        System.out.println(byPage);


    }
    @Test
    public  void  test2(){

        Long totals = guruService.findTotals();
        System.out.println(totals);


    }
}
