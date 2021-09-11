package com.jzx.mysboot.controller;

import com.jzx.feign.order.OrderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Jiangzx
 * @Date 2021/9/8
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    OrderFeignService orderFeignService;

    @GetMapping(value = "/findOrderByUserId/{id}")
    public String findOrderByUserId(@PathVariable("id") Integer id) {
        //feign调用
        String result = orderFeignService.findOrderByUserId(id);
        return result;
    }
}
