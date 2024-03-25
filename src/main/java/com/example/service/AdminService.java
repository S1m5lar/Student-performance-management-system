package com.example.service;

import com.example.enetity.Admin;
import com.example.exception.CustomException;
import com.example.mapper.AdminMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {

    /**
     * 默认请求接口
     */
    @Resource
    private AdminMapper adminMapper;

    /**
     * 登录
     */
    public Admin login(Admin admin){
        Admin dbAdmin = adminMapper.selectByUsername(admin.getUsername());
        if(dbAdmin == null){
            //没有用户
            throw new CustomException("账号或密码错误");
        }
        //比较密码
        if(!admin.getPassword().equals(dbAdmin.getPassword())){
            throw new CustomException("账号或密码错误");
        }
        //登录成功
        return dbAdmin;
    }
}
