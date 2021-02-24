package com.svjk.blog.service;

import com.svjk.blog.pojo.article_info;

/**
 * @author shkstart
 * @create 2021-02-14 22:36
 */
public interface ArticleInfomationService {

    //访客进入首页所显示的所有博客文章
    public article_info queryarticle();

}
