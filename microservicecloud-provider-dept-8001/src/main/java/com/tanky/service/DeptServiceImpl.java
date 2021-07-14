package com.tanky.service;

import com.tanky.dao.DeptDao;
import com.tanky.entries.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建人： 19697
 * 创建时间： 2019/12/22
 * 作用：
 * 修改信息：
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }
//
//    @Override
//    public Dept get(Long id) {
//        return deptDao.findById(id);
//    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
