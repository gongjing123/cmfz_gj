package com.baizhi.service;

import com.baizhi.entity.Guru;

import java.util.List;

public interface GuruService {

    //------------添加---------------------
    void add(Guru guru);
    //-------------分页查询----------------
    List<Guru> findByPage(Integer page, Integer rows);
    //-------------查询总的条数----------------
    Long findTotals();
    //---------删除一行-----------------
    void remove(String id);
    //---------查询单个图片---------------
    Guru findOne(String id);
    //---------修改用图片信息----------
    void motify(Guru guru);
}
