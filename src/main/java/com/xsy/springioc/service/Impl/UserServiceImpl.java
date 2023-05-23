package com.xsy.springioc.service.Impl;

import com.xsy.springioc.anno.Devalue;
import com.xsy.springioc.anno.Instantiate;
import com.xsy.springioc.dao.UserDao;
import com.xsy.springioc.service.UserService;

@Instantiate
public class UserServiceImpl implements UserService {

    @Devalue
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("com/xsy/springioc/service");
        userDao.add();
    }
}
