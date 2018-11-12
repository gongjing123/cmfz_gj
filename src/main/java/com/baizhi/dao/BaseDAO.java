package com.baizhi.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDAO<T> {
    //------------添加---------------------
    void insert(T t);
    //------------修改---------------------
    void update(T t);
    //-------------删除------------------
    void delete(String id);
    //------------查询单个----------------
    T queryOne(String id);
    //-------------登录查询---------------
    T query(@Param("username") String username,@Param("password") String Password);
    //-------------查询所有----------------
    List<T> queryAll();
    //-------------分页查询----------------
    //参数1:起始条数 //参数2:每页显示的记录数
    List<T> queryByPage(@Param("start") Integer start, @Param("rows") Integer rows);
    //-------------查询总的条数----------------
    Long queryTotals();

}
