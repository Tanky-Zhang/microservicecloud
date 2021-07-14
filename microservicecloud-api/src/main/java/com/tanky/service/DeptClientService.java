package com.tanky.service;

import com.tanky.entries.Dept;
import com.tanky.entries.DeptClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/22
 * 作用：这个接口提供对Feign的支持  通过动态代理技术实现的吧
 * 修改信息：
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
//对feign添加了熔断的处理类
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory= DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);

}
