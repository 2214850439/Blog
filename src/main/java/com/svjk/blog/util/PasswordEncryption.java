package com.svjk.blog.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * 密码加密工具类
 * @author 黄荷翔
 * @date 2021/2/8 20:44
 */
public class PasswordEncryption {

    public String passwordencryption(Object login,Object password){
        //加密类型：MD5
        String hashAlgorithmName = "MD5";
        //获取密码
        Object credentials = password;
        //获取账号进行盐值加密
        Object salt = ByteSource.Util.bytes(login);
        //加密次数1024
        int hashIterations = 1024;
        Object result = new SimpleHash(hashAlgorithmName,credentials,salt,hashIterations);
        String s = String.valueOf(result);
        return s;
    }

}
