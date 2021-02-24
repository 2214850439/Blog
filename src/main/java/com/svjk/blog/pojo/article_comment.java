package com.svjk.blog.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 文章详情
 * @author 黄荷翔
 * @date 2021/2/2 23:53
 */
@Data
public class article_comment {
    //表id
    private int id;
    //文章id
    private int article_id;
    //用户id
    private int user_id;
    //评论用户id，如果不是回复其他人默认为空
    private int comment_user_id;
    //评论内容
    private String content;
    //创建日期
    private Date create_date;
    //最后编辑日期
    private Date update_date;
    //是否删除
    private String del;

    @Override
    public String toString() {
        return "article_comment{" +
                "id=" + id +
                ", article_id=" + article_id +
                ", user_id=" + user_id +
                ", comment_user_id=" + comment_user_id +
                ", content='" + content + '\'' +
                ", create_date=" + create_date +
                ", update_date=" + update_date +
                ", del='" + del + '\'' +
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getComment_user_id() {
        return comment_user_id;
    }

    public void setComment_user_id(int comment_user_id) {
        this.comment_user_id = comment_user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }
}
