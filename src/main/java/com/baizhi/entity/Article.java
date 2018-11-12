package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/*文章类*/
public class Article {
    private int id;
    private String title;
    private String content;
    private String insertimgPath;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd ")
    private Date publishDate;
    private String guru_name;

    public Article() {
    }

    public Article(int id, String title, String content, String insertimgPath, Date publishDate, String guru_name) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.insertimgPath = insertimgPath;
        this.publishDate = publishDate;
        this.guru_name = guru_name;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", insertimgPath='" + insertimgPath + '\'' +
                ", publishDate=" + publishDate +
                ", guru_name='" + guru_name + '\'' +
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getInsertimgPath() {
        return insertimgPath;
    }

    public void setInsertimgPath(String insertimgPath) {
        this.insertimgPath = insertimgPath;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getGuru_name() {
        return guru_name;
    }

    public void setGuru_name(String guru_name) {
        this.guru_name = guru_name;
    }
}
