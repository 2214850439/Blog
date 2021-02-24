package com.svjk.blog.service;

import com.svjk.blog.pojo.user_info;

/**
 * @author shkstart
 * @create 2021-02-04 22:57
 */
public interface LoginService {
    //进行用户登录查看验证账号密码
    public user_info userlogin(user_info userinfo);
    //通过shiro进行用户的登录验证
    public user_info querylogin(String userlogin);


}
