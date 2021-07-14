package com.tanky;

import com.tanky.Myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/22
 * 作用：主启动类
 * 修改信息：
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= MySelfRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer80_App.class, args);

    }

}
