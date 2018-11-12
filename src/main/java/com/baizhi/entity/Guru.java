package com.baizhi.entity;
/*上师类*/
public class Guru {
    private int id;
    private String name;
    private String headPic;//头像
    private String gender;//性别

    public Guru() {
    }

    public Guru(int id, String name, String headPic, String gender) {
        this.id = id;
        this.name = name;
        this.headPic = headPic;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Guru{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", headPic='" + headPic + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
