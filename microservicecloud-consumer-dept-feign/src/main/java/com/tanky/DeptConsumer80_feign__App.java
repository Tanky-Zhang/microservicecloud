package com.tanky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/22
 * 作用：主启动类
 * 修改信息：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.tanky"})
public class DeptConsumer80_feign__App {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer80_feign__App.class, args);

    }

}
