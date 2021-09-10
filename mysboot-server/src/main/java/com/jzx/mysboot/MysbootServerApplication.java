package com.jzx.mysboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description
 * @Author Jiangzx
 * @Date 2021/9/6
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages="com.jzx.*")
public class MysbootServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MysbootServerApplication.class, args);

        String name = applicationContext.getEnvironment().getProperty("name");
        System.out.println("common name :"+name);
    }
}
