package com.jzx.mysboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Jiangzx
 * @Date 2021/9/7
 */
@RestController
@RequestMapping("/mytboot")
@RefreshScope
public class TestControlller {

    @Value("${name:test}")
    private String name;

    @GetMapping("/test")
    public String test(){
        return name;
    }
}
