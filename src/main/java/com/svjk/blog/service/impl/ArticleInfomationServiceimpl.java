package com.svjk.blog.service.impl;

import com.svjk.blog.mapper.ArticleInformationMapper;
import com.svjk.blog.pojo.article_info;
import com.svjk.blog.service.ArticleInfomationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 黄荷翔
 * @date 2021/2/14 22:36
 */
@Service
public class ArticleInfomationServiceimpl implements ArticleInfomationService {


    @Resource
    private ArticleInformationMapper articleinformationmapper;

    @Override
    public article_info queryarticle() {
        article_info qa = articleinformationmapper.queryarticle();
        String qat = articleinformationmapper.queryArticleType(qa.getType());
        qa.setArticlename(qat);
        return qa;
    }
}
