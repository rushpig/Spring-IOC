package com.xsy.springioc.dao.Impl;

import com.xsy.springioc.anno.Instantiate;
import com.xsy.springioc.dao.UserDao;

@Instantiate
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao....");
    }
}
