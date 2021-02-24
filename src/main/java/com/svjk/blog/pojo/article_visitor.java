package com.svjk.blog.pojo;

import lombok.Data;

/**
 * 文章与访客关联表
 * @author 黄荷翔
 * @date 2021/2/2 23:53
 */
@Data
public class article_visitor {
    //表id
    private int id;
    //文章id
    private int article_id;
    //访客ip
    private String ip;
    //访问者id，如果未登录为0
    private int user_id;

    @Override
    public String toString() {
        return "article_visitor{" +
                "id=" + id +
                ", article_id=" + article_id +
                ", ip='" + ip + '\'' +
                ", user_id=" + user_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
