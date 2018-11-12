package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Album {
    private int id;
    private String title;//专辑标题
    private String coverImg;//封面图片
    private int count;//集数
    private String score;//评分
    private String author;//作者
    private String broadCast;//播音
    private String brief;//内容简介
    @DateTimeFormat(pattern = "yyyy-MM-dd ")
    @JsonFormat(pattern = "yyyy-MM-dd ")
    private Date publishDate;//发布时间
    private List<Chapter> children;//章节集合

    public Album() {
    }

    public Album(int id, String title, String coverImg, int count, String score, String author, String broadCast, String brief, Date publishDate, List<Chapter> children) {
        this.id = id;
        this.title = title;
        this.coverImg = coverImg;
        this.count = count;
        this.score = score;
        this.author = author;
        this.broadCast = broadCast;
        this.brief = brief;
        this.publishDate = publishDate;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", count=" + count +
                ", score='" + score + '\'' +
                ", author='" + author + '\'' +
                ", broadCast='" + broadCast + '\'' +
                ", brief='" + brief + '\'' +
                ", publishDate=" + publishDate +
                ", children=" + children +
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

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBroadCast() {
        return broadCast;
    }

    public void setBroadCast(String broadCast) {
        this.broadCast = broadCast;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public List<Chapter> getChildren() {
        return children;
    }

    public void setChildren(List<Chapter> children) {
        this.children = children;
    }
}
