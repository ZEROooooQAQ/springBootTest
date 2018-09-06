package com.springboottest.demo.domain;

import java.util.Date;

/**
 * Description: 实体类
 * <p>
 * Created by jianwuli on 2018/9/6 20:29
 */
public class User {
    private Integer id;
    private String name;
    private String password;
    private String remark;
    private String email;
    private Date modifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", remark='" + remark + '\'' +
                ", email='" + email + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
