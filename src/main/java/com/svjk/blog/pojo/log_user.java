package com.svjk.blog.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 用户日志
 * @author 黄荷翔
 * @date 2021/2/2 23:53
 */
@Data
public class log_user {
    //表id
    private int id;
    //用户ip
    private String ip;
    //用户操作系统
    private String system;
    //用户id
    private int user_id;
    //浏览器分辨率
    private String resolving_power;
    //访问设备，比如浏览器名称
    private String equipment;
    //行为，比如登录操作
    private String behavior;
    //操作日期
    private Date date;
    //该操作记录是否不统计
    private int del;

    @Override
    public String toString() {
        return "log_user{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", system='" + system + '\'' +
                ", user_id=" + user_id +
                ", resolving_power='" + resolving_power + '\'' +
                ", equipment='" + equipment + '\'' +
                ", behavior='" + behavior + '\'' +
                ", date=" + date +
                ", del=" + del +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getResolving_power() {
        return resolving_power;
    }

    public void setResolving_power(String resolving_power) {
        this.resolving_power = resolving_power;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }
}
