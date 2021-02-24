package com.svjk.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 黄荷翔
 * @date 2021/2/20 17:53
 */
@Configuration
public class WebContainerConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 所有当前站点的请求地址，都支持跨域访问。
                .allowedOriginPatterns("*") //所有的外部域都可跨域访问。 如果是localhost则很难配置，因为在跨域请求的时候，外部域的解析可能是localhost、127.0.0.1、主机名
                .allowedMethods("*")    // 当前站点支持的跨域请求类型是什么,比如"GET", "POST", "PUT", "DELETE"等，这里表示任意
                .maxAge(3600)      // 超时时长设置为1小时。 时间单位是秒
                .allowCredentials(true);  // 是否支持跨域用户凭证
    }
}
