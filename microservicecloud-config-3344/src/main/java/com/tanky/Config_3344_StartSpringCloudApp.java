package com.tanky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/22
 * 作用：
 * 修改信息：
 */

@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }
}
