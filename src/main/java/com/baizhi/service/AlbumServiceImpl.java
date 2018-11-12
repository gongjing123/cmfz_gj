package com.baizhi.service;

import com.baizhi.dao.AlbumDAO;
import com.baizhi.entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumDAO albumDAO;
    //-------------分页查询--------------------
    @Override
    public List<Album> findByPage(Integer page, Integer rows) {
        int start = (page-1)*rows;
        List<Album> albums = albumDAO.queryByPage(start, rows);
        return albums;
    }
    //-------------查询总的条数----------------

    @Override
    public Long findTotals() {
        Long totals = albumDAO.queryTotals();
        return totals;
    }

    //------------添加-----------
    @Override
    public void add(Album album) {
        albumDAO.insert(album);
    }

}
