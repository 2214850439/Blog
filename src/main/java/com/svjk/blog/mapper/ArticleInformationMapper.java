package com.svjk.blog.mapper;

import com.svjk.blog.pojo.article_info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 文章信息mapper接口
 *
 * @author shkstart
 * @create 2021-02-14 22:35
 */
@Mapper
public interface ArticleInformationMapper {

    //访客进入首页所显示的所有博客文章
    article_info queryarticle();

    /**
     * 根据文章类型去查询文章类型名称
     *
     * @param type type
     * @return string
     */
    String queryArticleType(@Param("type") int type);
}
