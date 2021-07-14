package com.tanky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/22
 * 作用：服务注册与发现的启动类
 * 修改信息：
 */
//EurekaServer服务器端启动类,接受其它微服务注册进来
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }


}
