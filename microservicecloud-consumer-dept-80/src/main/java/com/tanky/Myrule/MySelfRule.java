package com.tanky.Myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/22
 * 作用：
 * 修改信息：
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule()
    {
        //Ribbon默认是轮询，我自定义为随机
        //return new RandomRule();
        return new RandomRule_tanky();
    }
}
