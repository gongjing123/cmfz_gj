package com.baizhi.service;


import com.baizhi.dao.GuruDAO;
import com.baizhi.entity.Guru;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GuruServiceImpl implements GuruService {

    @Autowired
    private GuruDAO GuruDAO;


    //------------添加---------------------
    @Override
    public void add(Guru guru) {
        GuruDAO.insert(guru);
    }
    //-------------分页查询----------------
    @Override
    public List<Guru> findByPage(Integer page, Integer rows) {
        int start = (page-1)*rows;

        return  GuruDAO.queryByPage(start,rows);
    }
    //-------------查询总的条数----------------
    @Override
    public Long findTotals() {
        Long totals = GuruDAO.queryTotals();
        return totals;
    }
    //-----------删除一行--------------
    @Override
    public void remove(String id) {
        GuruDAO.delete(id);
    }
    //---------查询单个上师---------------
    @Override
    public Guru findOne(String id) {
        Guru guru = GuruDAO.queryOne(id);
        return guru;
    }
    //---------更新上师------------------
    @Override
    public void motify(Guru Guru) {
        GuruDAO.update(Guru);
        System.out.println("更新后的------------");
    }
}
