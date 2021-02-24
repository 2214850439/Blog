package com.svjk.blog.mapper;

import com.svjk.blog.pojo.log_user;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shkstart
 * @create 2021-02-13 23:28
 */
@Mapper
public interface LogModuleMapper {


    //根据用户id查询用户日志
    public log_user querylog(String ip);

    //用户登录时进行行为存储
    public int insertlog(log_user loguser);

}
