package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TitlePic {
    private int id;
    private  String title;
    private String path;
    private String status;
    //@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd ")
    private Date createtime;
    private  String description;
    private  String ordernum;

    public TitlePic(int id, String title, String path, String status, Date createtime, String description, String ordernum) {
        this.id = id;
        this.title = title;
        this.path = path;
        this.status = status;
        this.createtime = createtime;
        this.description = description;
        this.ordernum = ordernum;
    }

    @Override
    public String toString() {
        return "TitlePic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", status='" + status + '\'' +
                ", createtime=" + createtime +
                ", description='" + description + '\'' +
                ", ordernum='" + ordernum + '\'' +
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public TitlePic() {
    }


}
