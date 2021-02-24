package com.svjk.blog.pojo;


import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 文章状态日志表
 * @author 黄荷翔
 * @date 2021/2/2 23:54
 */
@Data
@ToString
public class alticle_type {
    //表id
    private int id;
    //文章类型
    private int type;
    //类型名称
    private String name;
    //创建者id
    private int create_user_id;
    //创建时间
    private Date create_date;
    //修改人id
    private int update_user_id;
    //最后修改日期
    private Date update_date;
    //是否删除
    private int del;

    @Override
    public String toString() {
        return "alticle_type{" +
                "id=" + id +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", create_user_id=" + create_user_id +
                ", create_date=" + create_date +
                ", update_user_id=" + update_user_id +
                ", update_date=" + update_date +
                ", del=" + del +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(int create_user_id) {
        this.create_user_id = create_user_id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public int getUpdate_user_id() {
        return update_user_id;
    }

    public void setUpdate_user_id(int update_user_id) {
        this.update_user_id = update_user_id;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }
}
