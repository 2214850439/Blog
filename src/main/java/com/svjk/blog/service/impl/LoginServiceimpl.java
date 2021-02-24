package com.svjk.blog.service.impl;

import com.svjk.blog.mapper.LoginMapper;
import com.svjk.blog.pojo.user_info;
import com.svjk.blog.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

/**
 * @author 黄荷翔
 * @date 2021/2/4 22:58
 */
@Service
public class LoginServiceimpl implements LoginService {

    @Resource
    private LoginMapper loginmapper;

    @Override
    public user_info  userlogin(user_info userinfo) {
        //根据收到的账号密码查询数据库是否存在
        user_info user = loginmapper.userlogin(userinfo);
        //判断查询返回值是否为空，为空直接返回控制器，不为空进入下一步
        if(user == null){
            return user;
        }else{
            //通过SimpleDateFormat把日期格式修改为String类型，yyyy(年)MM(月)dd(日)HH(时)mm(分)ss(秒)
            SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = sim.format(user.getCreateDate());
            //把转换后的String类型日期时间存入实体类中返回控制器
            user.setTime(time);
        }
        return user;
    }

    @Override
    public user_info querylogin(String userlogin) {
        return loginmapper.querylogin(userlogin);
    }
}
