package com.jzx.feign.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description
 * @Author Jiangzx
 * @Date 2021/9/8
 */
@FeignClient("mysboot-order")
public interface OrderFeignService {

    @GetMapping("/findOrderByUserId/{userId}")
    String findOrderByUserId(@PathVariable("userId") Integer userId);
}
