package com.seckill.time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: lpq
 * @Date: 2019/9/8 10:46
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class TimeApplication {
    //时间模块
    public static void main(String[] args) {
        SpringApplication.run(TimeApplication.class,args);
    }
}
