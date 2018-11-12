package com.baizhi.service;

import com.baizhi.entity.Album;

import java.util.List;

public interface AlbumService {
    //-------------分页查询----------------
    List<Album> findByPage(Integer page, Integer rows);
    //-------------查询总的条数----------------
    Long findTotals();
    //------------添加---------------------
    void add(Album album);
}
