package com.baizhi.entity;
/*章节表*/
public class Chapter {
    private int id;
    private String title;//标题
    private String size;//大小
    private String duration;//时长
    private String downloadPath;//下载路径
    private  String uploadDate;//上传路径
    private String album_id;//所属专辑

    public Chapter() {
    }

    public Chapter(int id, String title, String size, String duration, String downloadPath, String uploadDate, String album_id) {
        this.id = id;
        this.title = title;
        this.size = size;
        this.duration = duration;
        this.downloadPath = downloadPath;
        this.uploadDate = uploadDate;
        this.album_id = album_id;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", size='" + size + '\'' +
                ", duration='" + duration + '\'' +
                ", downloadPath='" + downloadPath + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                ", album_id='" + album_id + '\'' +
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDownloadPath() {
        return downloadPath;
    }

    public void setDownloadPath(String downloadPath) {
        this.downloadPath = downloadPath;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
    }
}
