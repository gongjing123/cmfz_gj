package com.baizhi.service;

import com.baizhi.entity.Course;

import java.util.List;

public interface CourseService {
    //-------
    List<Course> findAll(Integer page, Integer rows);
    //---------
    List<Course> findAll1(Integer page, Integer rows);
    //-------------查询总的条数----------------
    Long findTotals();
    //---------删除一行-----------------
    void remove(String id);
    //------------添加---------------------
    void add(Course course);
    //---------查询单个图片---------------
    Course findOne(String id);
    //---------修改用图片信息----------
    void motify(Course course);

}
