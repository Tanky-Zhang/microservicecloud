package com.tanky.service;


import com.tanky.entries.Dept;

import java.util.List;


public interface DeptService
{
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}

