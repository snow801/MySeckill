package com.seckill.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: lpq
 * @Date: 2019/9/7 22:01
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {
    //服务端
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }
}

