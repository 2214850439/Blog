package com.svjk.blog.controller;

import com.svjk.blog.pojo.log_user;
import com.svjk.blog.service.LogModuleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 日志模块
 * @author 黄荷翔
 * @date 2021/2/13 23:15
 */
@Controller
@RequestMapping("LogModule")
public class LogModule {

    @Resource
    private LogModuleService logmoduleservice;

    @RequestMapping("querylog")
    public void querylog(String ip){
        ip = "115.60.26.120";
        log_user log = logmoduleservice.querylog(ip);
        System.out.println(log);
    }

}
