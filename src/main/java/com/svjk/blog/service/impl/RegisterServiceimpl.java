package com.svjk.blog.service.impl;

import com.svjk.blog.mapper.RegisterMapper;
import com.svjk.blog.pojo.user_info;
import com.svjk.blog.service.RegisterService;
import com.svjk.blog.util.PasswordEncryption;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 黄荷翔
 * @date 2021/2/7 15:04
 */
@Service
public class RegisterServiceimpl implements RegisterService {

    @Resource
    private RegisterMapper registermapper;


    @Override
    public int userregister(user_info userinfo) {
        String password = new PasswordEncryption().passwordencryption(userinfo.getLogin(),userinfo.getPassword());
        userinfo.setPassword(password);
        int index = registermapper.register(userinfo);
        return index;
    }
}
