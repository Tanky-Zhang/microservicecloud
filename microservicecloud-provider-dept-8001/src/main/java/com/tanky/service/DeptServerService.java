package com.tanky.service;

import com.tanky.dao.DeptDao;
import com.tanky.thrift.DataException;
import com.tanky.thrift.Dept;
import com.tanky.thrift.DeptThriftService;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/23
 * 作用：
 * 修改信息：
 */
@Service
public class DeptServerService implements DeptThriftService.Iface {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept getDeptById(long id) throws DataException, TException {
        System.out.println("传入的id为---------------------------"+id);
        return deptDao.findById(id);
    }

}
