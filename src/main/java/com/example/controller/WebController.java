package com.example.controller;

import com.example.common.Result;
import com.example.enetity.Admin;
import com.example.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class WebController {

    @Resource
    private AdminService adminService;

    /**
     * 默认请求接口
     */
    @GetMapping("/")
    public Result hello() {
        return Result.success();
    }

    /**
     * 登录接口
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody Admin admin) {
        Admin dbAdmin = adminService.login(admin);
        return Result.success(dbAdmin);
    }

}
