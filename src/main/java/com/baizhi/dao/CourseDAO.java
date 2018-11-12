package com.baizhi.dao;

import com.baizhi.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseDAO extends BaseDAO<Course> {
    //-------必修-------
    List<Course> queryAll(@Param("start") Integer start, @Param("rows") Integer rows);
    //-------自定义---------
    List<Course> queryAll1(@Param("start") Integer start, @Param("rows") Integer rows);
}
