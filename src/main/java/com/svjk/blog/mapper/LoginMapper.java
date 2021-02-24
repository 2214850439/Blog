package com.svjk.blog.mapper;

import com.svjk.blog.pojo.user_info;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shkstart
 * @create 2021-02-04 23:03
 */
@Mapper
public interface LoginMapper {

    //用获取到的数据查询数据库并返回一个实体类
    public user_info userlogin(user_info userinfo);
    //通过shiro进行用户的登录验证
    public user_info querylogin(String userlogin);

}
