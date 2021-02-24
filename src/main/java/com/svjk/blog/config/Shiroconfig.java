package com.svjk.blog.config;

import com.svjk.blog.util.ShiroRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Shiro配置类
 * @author 黄荷翔
 * @date 2021/2/8 13:17
 */

@Configuration
public class Shiroconfig {

    /*
    * 创建ShiroFilterFactoryBean
    * */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("security") DefaultWebSecurityManager security){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(security);


        //添加shiro内置过滤器
        /*
        * Shiro内置过滤器，可以实现权限相关的拦截器
        *   常用过滤器：
        *       anon：无需认证（登录）可以访问
        *       authc：必须认证才可以访问
        *       user：如果使用rememberMe的功能可以直接访问
        *       perms：该资源必须得到资源权限才可以访问
        *       role：该资源必须得到角色权限才可以访问
        * */
        /*Map<String,String> filterMap = new LinkedHashMap<String,String>();*/


        //修改登录页面
        /*shiroFilterFactoryBean.getLoginUrl();*/
        return shiroFilterFactoryBean;
    }
    /*
    * 创建DefaultWebSecurityManager
    * */
    @Bean(name = "security")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("shiroRealm") ShiroRealm shiroRealm){
        DefaultWebSecurityManager SecurityManager = new DefaultWebSecurityManager();
        //关联Realm
        SecurityManager.setRealm(shiroRealm);
        return SecurityManager;
    }
    /*
    * 创建Realm
    * */
    @Bean(name = "shiroRealm")
    public ShiroRealm getRealm(){
        return new ShiroRealm();
    }
}
