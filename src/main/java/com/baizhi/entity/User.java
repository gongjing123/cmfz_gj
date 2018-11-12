package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/*用户类*/
public class User {
    private int id;
    private String username;//用户名
    private String phoneNum;//电话号码
    private String password;//密码
    private  String salt;//盐值
    private  String dharmaName;//法名
    private String gender;//性别
    private String headPic;//头像
    private String signature;//签名
    private String province;//省
    private String city;//城市
    private String status;//状态
    @DateTimeFormat(pattern = "yyyy-MM-dd ")
    @JsonFormat(pattern = "yyyy-MM-dd ")
    private Date createTime;//创建时间

    public User() {
    }

    public User(int id, String username, String phoneNum, String password, String salt, String dharmaName, String gender, String headPic, String signature, String province, String city, String status, Date createTime) {
        this.id = id;
        this.username = username;
        this.phoneNum = phoneNum;
        this.password = password;
        this.salt = salt;
        this.dharmaName = dharmaName;
        this.gender = gender;
        this.headPic = headPic;
        this.signature = signature;
        this.province = province;
        this.city = city;
        this.status = status;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", dharmaName='" + dharmaName + '\'' +
                ", gender='" + gender + '\'' +
                ", headPic='" + headPic + '\'' +
                ", signature='" + signature + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getDharmaName() {
        return dharmaName;
    }

    public void setDharmaName(String dharmaName) {
        this.dharmaName = dharmaName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
