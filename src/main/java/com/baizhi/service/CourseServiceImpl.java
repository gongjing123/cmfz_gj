package com.baizhi.service;

import com.baizhi.dao.CourseDAO;
import com.baizhi.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {


    @Autowired
    private CourseDAO courseDAO;

    @Override
    public List<Course> findAll(Integer page, Integer rows) {
        int start = (page-1)*rows;
        List<Course> courses = courseDAO.queryAll(start,rows);
        return courses;
    }

    @Override
    public Long findTotals() {
        Long totals = courseDAO.queryTotals();
        return totals;
    }

    @Override
    public List<Course> findAll1(Integer page, Integer rows) {
        int start = (page-1)*rows;
        List<Course> courses = courseDAO.queryAll1(start,rows);
        return courses;
    }

    @Override
    public void remove(String id) {
        courseDAO.delete(id);
    }

    @Override
    public void add(Course course) {

        courseDAO.insert(course);
    }

    @Override
    public Course findOne(String id) {
        Course course = courseDAO.queryOne(id);
        return course;
    }

    @Override
    public void motify(Course course) {
        courseDAO.update(course);

    }
}
