package com.jzx.order.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Jiangzx
 * @Date 2021/9/8
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/findOrderByUserId/{userId}")
    public String findOrderByUserId(@PathVariable("userId") Integer userId){
        return "Hello world! " + userId;
    }
}
