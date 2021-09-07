package com.jzx.mysboot.controller;

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
public class TestControlller {

    @GetMapping("/test")
    public String test(){
        return "hello";
    }
}
