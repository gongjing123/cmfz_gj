package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/*计数器类*/
public class Counter {
    private int id;
    private String title;
    private int user_id;
    private int course_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    public Counter() {
    }

    public Counter(int id, String title, int user_id, int course_id, Date createTime) {
        this.id = id;
        this.title = title;
        this.user_id = user_id;
        this.course_id = course_id;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", user_id=" + user_id +
                ", course_id=" + course_id +
                ", createTime=" + createTime +
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
