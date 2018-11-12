package com.baizhi.service;


import com.baizhi.dao.TitlePicDAO;
import com.baizhi.entity.TitlePic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TitlePicServiceImpl implements TitlePicService {

    @Autowired
    private TitlePicDAO titlePicDAO;


    //------------添加---------------------
    @Override
    public void add(TitlePic titlePic) {
        titlePicDAO.insert(titlePic);
    }
    //-------------分页查询----------------
    @Override
    public List<TitlePic> findByPage(Integer page, Integer rows) {
        int start = (page-1)*rows;

        return  titlePicDAO.queryByPage(start,rows);
    }
    //-------------查询总的条数----------------
    @Override
    public Long findTotals() {
        Long totals = titlePicDAO.queryTotals();
        return totals;
    }
    //-----------删除一行--------------
    @Override
    public void remove(String id) {
        titlePicDAO.delete(id);
    }
    //---------查询单个图片---------------
    @Override
    public TitlePic findOne(String id) {
        TitlePic titlePic = titlePicDAO.queryOne(id);
        return titlePic;
    }
    //---------更新图片------------------
    @Override
    public void motify(TitlePic titlePic) {
        titlePicDAO.update(titlePic);
        System.out.println("更新后的------------");
    }
}
