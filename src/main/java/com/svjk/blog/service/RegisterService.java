package com.svjk.blog.service;

import com.svjk.blog.pojo.user_info;

/**
 * @author shkstart
 * @create 2021-02-07 15:04
 */
public interface RegisterService {

    //通过获取到的数据进行用户注册
    public int userregister(user_info userinfo);

}
