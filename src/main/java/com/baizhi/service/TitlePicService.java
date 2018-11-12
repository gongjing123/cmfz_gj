package com.baizhi.service;

import com.baizhi.entity.TitlePic;

import java.util.List;

public interface TitlePicService {

    //------------添加---------------------
    void add(TitlePic titlePic);
    //-------------分页查询----------------
    List<TitlePic> findByPage(Integer page, Integer rows);
    //-------------查询总的条数----------------
    Long findTotals();
    //---------删除一行-----------------
    void remove(String id);
    //---------查询单个图片---------------
    TitlePic findOne(String id);
    //---------修改用图片信息----------
    void motify(TitlePic TitlePic);
}
