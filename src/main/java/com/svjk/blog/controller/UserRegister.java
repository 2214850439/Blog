package com.svjk.blog.controller;

import com.svjk.blog.pojo.user_info;
import com.svjk.blog.service.RegisterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 用户注册
 * @author 黄荷翔
 * @date 2021/2/7 14:44
 */
@RestController
@RequestMapping("UserRegister")
public class UserRegister {

    @Resource
    private RegisterService registerservice;

    @RequestMapping("register")
    public void register(user_info userinfo){
        //因为注册时用户名与登录账号一致，所以把用户名赋值给账号一遍
        userinfo.setLogin(userinfo.getName());
        //通过new Date()获取到系统当前时间进行账户创建日期存储
        userinfo.setCreateDate(new Date());
        //把获取到的值存入到数据库，返回值为1代表执行成功一条数据，反之为失败
        int index = registerservice.userregister(userinfo);
        if (index == 0){
            System.out.println("用户注册失败！");
        }else{
            System.out.println("用户注册成功！请进入登录页面进行登录");
        }
    }

}
