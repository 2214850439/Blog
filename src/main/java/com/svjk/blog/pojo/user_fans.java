package com.svjk.blog.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 粉丝与用户关联表
 * @author 黄荷翔
 * @date 2021/2/2 23:53
 */
@Data
public class user_fans {
    //表id
    private int id;
    //用户id
    private int user_id;
    //粉丝id
    private int fans_id;
    //关注日期
    private Date create_date;
    //是否取消关注
    private int del;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getFans_id() {
        return fans_id;
    }

    public void setFans_id(int fans_id) {
        this.fans_id = fans_id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    @Override
    public String toString() {
        return "user_fans{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", fans_id=" + fans_id +
                ", create_date=" + create_date +
                ", del=" + del +
                '}';
    }
}
