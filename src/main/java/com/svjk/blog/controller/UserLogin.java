package com.svjk.blog.controller;

import com.svjk.blog.pojo.log_user;
import com.svjk.blog.pojo.user_info;
import com.svjk.blog.service.LogModuleService;
import com.svjk.blog.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 用户登录
 * @author 黄荷翔
 * @date 2021/2/2 23:38
 */

@RestController
@CrossOrigin
@RequestMapping("UserLogin")
public class UserLogin {

    @Resource
    private LoginService loginservice;

    @Resource
    private LogModuleService logmoduleservice;


    //用户登录
    @RequestMapping("login")
    public Object login(user_info userinfo, @Param("login") String logins,@Param("passwords") String passwords){
        //获取用户提交的账号和密码
        String password = userinfo.getPassword();
        String login = userinfo.getLogin();
        //获取subject
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            // 把用户名和密码封装为 UsernamePasswordToken 对象
            UsernamePasswordToken token = new UsernamePasswordToken(login, password);
            token.setRememberMe(true);
            try {
                currentUser.login(token);
                /*user_info urio = new user_info();
                urio.setLogin(login);
                //调用密码加密工具类对密码进行加密
                PasswordEncryption passwordencryption = new PasswordEncryption();
                //密码加密工具类里的passwordencryption方法进行密码MD5盐值加密
                String pe = passwordencryption.passwordencryption(login, password);
                urio.setPassword(pe);
                //通过账户密码进行用户查询
                user_info usfoid = loginservice.userlogin(urio);
                //调用本类的insertlog方法并传入用户id
                this.insertlog(usfoid.getId());*/
                System.out.println("账号密码正确，登录成功！");
                return "账号密码正确，登录成功！";
            }catch (AuthenticationException ae){
                System.out.println("账号或密码不正确，请重新输入！");
                return "账号或密码不正确，请重新输入！";
            }
        }
        return "";
    }

    /**
     *
     * @param usfoid
     */
    //用户登录时进行日志行为存储
    public void insertLog(int usfoid){
        log_user loguser = new log_user();
        loguser.setUser_id(usfoid);
        loguser.setDate(new Date());

    }


}
