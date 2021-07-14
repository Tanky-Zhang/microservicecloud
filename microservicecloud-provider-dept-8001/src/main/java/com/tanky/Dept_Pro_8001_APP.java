package com.tanky;

import com.tanky.thrift.ThriftServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/22
 * 作用：
 * 修改信息：
 */
@EnableEurekaClient
@SpringBootApplication
public class Dept_Pro_8001_APP {

    private static ThriftServer thriftServer;

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Dept_Pro_8001_APP.class, args);

        try {
            thriftServer = context.getBean(ThriftServer.class);
            //启动监听 如果是spring可以去写一个关于thrift的监听器或者使用@PostContrut
            thriftServer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
