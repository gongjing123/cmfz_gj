package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/*功课类*/
public class Course {
    private int id;
    private  String title;
    private String marking;//标记是否为必修功课
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd ")
    private Date createTime;
    private List<Counter>counters;

    public Course() {
    }

    public Course(int id, String title, String marking, Date createTime, List<Counter> counters) {
        this.id = id;
        this.title = title;
        this.marking = marking;
        this.createTime = createTime;
        this.counters = counters;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", marking='" + marking + '\'' +
                ", createTime=" + createTime +
                ", counters=" + counters +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMarking() {
        return marking;
    }

    public void setMarking(String marking) {
        this.marking = marking;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Counter> getCounters() {
        return counters;
    }

    public void setCounters(List<Counter> counters) {
        this.counters = counters;
    }
}
