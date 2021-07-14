package com.tanky.thrift;

import com.tanky.service.DeptServerService;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/23
 * 作用：
 * 修改信息：
 */
@Component
public class ThriftServer {

    @Autowired
    DeptServerService  deptServerService;


    public  void start() throws TTransportException {

        //监听本机的8001端口
        TNonblockingServerSocket socket=new TNonblockingServerSocket(9009);

        THsHaServer.Args args =new THsHaServer.Args(socket).minWorkerThreads(2).maxWorkerThreads(4);

        DeptThriftService.Processor<DeptServerService> processor=new DeptThriftService.Processor<>(deptServerService);

        args.protocolFactory(new TCompactProtocol.Factory());
        args.transportFactory(new TFramedTransport.Factory());
        args.processorFactory(new TProcessorFactory(processor));

        TServer server=new THsHaServer(args);
        System.out.println("thrift started!!!!!!!!!!!!!!!!!!!");
        //堵塞等待
        server.serve();



    }

}
