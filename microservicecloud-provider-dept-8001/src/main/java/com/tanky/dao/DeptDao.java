package com.tanky.dao;

import com.tanky.entries.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public com.tanky.thrift.Dept findById(Long id);

    public List<Dept> findAll();

}
