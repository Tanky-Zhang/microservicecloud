package com.tanky.controller;

import com.tanky.entries.Dept;
import com.tanky.thrift.DataException;
import com.tanky.thrift.DeptThriftService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/22
 * 作用：  /consumer/dept/get/{id
 * 修改信息：
 */
@RestController
public class DeptController_Consumer {


   // private static final String REST_URL_PREFIX = "http://localhost:8001";
   private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
        //通过rest调用8001的应用
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public  com.tanky.thrift.Dept get(@PathVariable("id") Long id) throws IOException {

        //数据传输方式
        TTransport tTransport =new TFramedTransport(new TSocket("localhost",9009),600);
        //数据压缩格式
        TProtocol protocol =new TCompactProtocol(tTransport);

        DeptThriftService.Client client=new DeptThriftService.Client(protocol);

        com.tanky.thrift.Dept dept=null;
        try {
            tTransport.open();
            dept=client.getDeptById(id);
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (DataException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }

        return dept;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }


}
