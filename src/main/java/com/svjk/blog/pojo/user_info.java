package com.svjk.blog.pojo;


import lombok.Data;

import java.util.Date;

/**
 * 用户表
 * @author 黄荷翔
 * @date 2021/2/2 23:39
 */
public class user_info {
    //用户表id
    private int id;
    //用户头像
    private String image;
    //用户昵称
    private String name;
    //登录账号
    private String login;
    //登录密码
    private String password;
    //用户类型
    private int type;
    //电子邮箱
    private String email;
    //手机号
    private String tel;
    //性别
    private String gender;
    //如果其他人注册则填写ID
    private int createUserId;
    //注册日期
    private Date createDate;
    //是否被删除
    private int del;
    //注册日期改为String类型
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "user_info{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", gender='" + gender + '\'' +
                ", createUserId=" + createUserId +
                ", createDate=" + createDate +
                ", del=" + del +
                ", time='" + time + '\'' +
                '}';
    }
}
