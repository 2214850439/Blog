package com.svjk.blog.service.impl;

import com.svjk.blog.mapper.LogModuleMapper;
import com.svjk.blog.pojo.log_user;
import com.svjk.blog.service.LogModuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 黄荷翔
 * @date 2021/2/13 23:26
 */
@Service
public class LogModuleServiceimpl implements LogModuleService {

    @Resource
    private LogModuleMapper logmodulemapper;


    @Override
    public log_user querylog(String ip) {
        log_user log = logmodulemapper.querylog(ip);
        if(log == null){
            return null;
        }
        return log;
    }

    @Override
    public int insertlog(log_user loguser) {
        return 0;
    }


}
