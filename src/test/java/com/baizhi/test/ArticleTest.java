package com.baizhi.test;

import com.baizhi.entity.Article;
import com.baizhi.service.ArticleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArticleTest extends  BaseTest {


    @Autowired
    private ArticleService articleService;

    @Test
    public  void  test1(){

        List<Article> byPage = articleService.findByPage(1, 2);
        System.out.println(byPage);


    }
    @Test
    public  void  test2(){

        Long totals = articleService.findTotals();
        System.out.println(totals);


    }
}
