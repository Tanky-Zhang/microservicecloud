package com.tanky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/22
 * 作用：
 * 修改信息：
 */
@EnableEurekaClient
@SpringBootApplication
public class Dept_Pro_8001_APP {


    public static void main(String[] args) {

        SpringApplication.run(Dept_Pro_8001_APP.class, args);
    }

}
