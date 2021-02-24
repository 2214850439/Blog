package com.svjk.blog.mapper;

import com.svjk.blog.pojo.user_info;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shkstart
 * @create 2021-02-07 15:03
 */
@Mapper
public interface RegisterMapper {

    //通过拿到的数据存入数据库进行用户的注册
    public int register(user_info userinfo);

}
