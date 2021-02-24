package com.svjk.blog.controller;

import com.svjk.blog.pojo.article_info;
import com.svjk.blog.service.ArticleInfomationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * 文章信息
 *
 * @author 黄荷翔
 * @date 2021/2/13 23:17
 */
@RestController
@RequestMapping("ArticleInformation")
public class ArticleInformation {

    @Resource
    private ArticleInfomationService articleinfomationservice;

    //访客进入首页所显示的所有博客文章
    @RequestMapping("queryarticle")
    public Object queryarticle(HttpServletRequest request) {
        final Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()) {
            final String name = names.nextElement();
            final String values = request.getHeader(name);
            System.out.println(String.format("[%s]=[%s]", name, values));
        }
        article_info qa = articleinfomationservice.queryarticle();
        System.out.println("文章封面：" + qa.getCover());
        System.out.println("文章类型：" + qa.getArticlename());
        System.out.println("文章标题：" + qa.getTitle());
        System.out.println("文章内容：" + qa.getContent());
        return qa;
    }

}
