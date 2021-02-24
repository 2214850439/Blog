package com.svjk.blog.util;

import com.svjk.blog.pojo.user_info;
import com.svjk.blog.service.LoginService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

/**
 * 自定义的Realm类
 * @author 黄荷翔
 * @date 2021/2/8 12:20
 */
public class ShiroRealm extends AuthorizingRealm {

    @Resource
    private LoginService loginservice;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        //1. 把 AuthenticationToken 转换为 UsernamePasswordToken
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        //2. 从 UsernamePasswordToken 中来获取 username
        String login = upToken.getUsername();
        //3. 调用数据库的方法, 从数据库中查询 username 对应的用户记录
        /*User uu = (User)redisTemplateUtil.get(username);*/
        /*if(uu == null) {*/
            user_info userinfo = loginservice.querylogin(login);
            /*redisTemplateUtil.set(username, uu);*/
        /*}*/
        //4. 若用户不存在, 则可以抛出 UnknownAccountException 异常
        if(userinfo == null){
            return  null;
        }
        //6. 根据用户的情况, 来构建 AuthenticationInfo 对象并返回. 通常使用的实现类为: SimpleAuthenticationInfo
        //以下信息是从数据库中获取的.
        //1). principal: 认证的实体信息. 可以是 username, 也可以是数据表对应的用户的实体类对象.
        Object principal = userinfo.getLogin();
        //2). credentials: 密码.
        Object credentials = upToken.getPassword();
        //3). realmName: 当前 realm 对象的 name. 调用父类的 getName() 方法即可
        String realmName = getName();
        //4). 盐值.密码进行MD5加密之后再与登录账号合并进行盐值加密
        ByteSource credentialsSalt = ByteSource.Util.bytes(userinfo.getLogin());
        //5). SimpleAuthenticationInfo中有个四个参数，principal是用户名，credentials是密码，credentialsSalt加密方式
        return new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {


        return null;
    }


}
