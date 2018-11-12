package com.baizhi.entity;

import java.util.List;

public class Menus {
    private int id;
    private String name;
    private String iconCls;
    private String href;
    private int p_id;
    private List<Menus> list;

    @Override
    public String toString() {
        return "Menus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", href='" + href + '\'' +
                ", p_id=" + p_id +
                ", list=" + list +
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

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public List<Menus> getList() {
        return list;
    }

    public void setList(List<Menus> list) {
        this.list = list;
    }

    public Menus(int id, String name, String iconCls, String href, int p_id, List<Menus> list) {
        this.id = id;
        this.name = name;
        this.iconCls = iconCls;
        this.href = href;
        this.p_id = p_id;
        this.list = list;
    }

    public Menus() {
    }
}
