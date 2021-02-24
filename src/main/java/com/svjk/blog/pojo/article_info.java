package com.svjk.blog.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 文章表
 * @author 黄荷翔
 * @date 2021/2/2 23:53
 */
@Data
public class article_info {
    //表id
    private int id;
    //用户id
    private int user_id;
    //文章标题
    private String title;
    //文章内容
    private Object content;
    //文章类型
    private int type;
    //发表日期
    private Date create_date;
    //修改日期
    private Date update_date;
    //修改的用户id
    private int update_user_id;
    //文章封面
    private String cover;
    //发布者ip
    private String ip;
    //是否被删除
    private int del;


    //文章类型名称
    private String articlename;

    @Override
    public String toString() {
        return "article_info{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", title='" + title + '\'' +
                ", content=" + content +
                ", type=" + type +
                ", create_date=" + create_date +
                ", update_date=" + update_date +
                ", update_user_id=" + update_user_id +
                ", cover='" + cover + '\'' +
                ", ip='" + ip + '\'' +
                ", del=" + del +
                ", articlename='" + articlename + '\'' +
                '}';
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public int getUpdate_user_id() {
        return update_user_id;
    }

    public void setUpdate_user_id(int update_user_id) {
        this.update_user_id = update_user_id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public String getArticlename() {
        return articlename;
    }

    public void setArticlename(String articlename) {
        this.articlename = articlename;
    }
}
