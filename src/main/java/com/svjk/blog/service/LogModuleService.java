package com.svjk.blog.service;

import com.svjk.blog.pojo.log_user;

/**
 * @author shkstart
 * @create 2021-02-13 23:26
 */
public interface LogModuleService {


    //根据用户id查询用户日志
    public log_user querylog(String ip);

    //用户登录时进行行为存储
    public int insertlog(log_user loguser);

}
