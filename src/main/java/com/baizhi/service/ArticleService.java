package com.baizhi.service;

import com.baizhi.entity.Article;

import java.util.List;

public interface ArticleService  {

    //------------添加---------------------
    void add(Article article);
    //-------------分页查询----------------
    List<Article> findByPage(Integer page, Integer rows);
    //-------------查询总的条数----------------
    Long findTotals();
    //---------删除一行-----------------
    void remove(String id);
    //---------查询单个文章---------------
    Article findOne(String id);
    //---------修改文章信息----------
    void motify(Article article);
}
