package com.xsy.springioc.controller;

import com.xsy.springioc.anno.Devalue;
import com.xsy.springioc.anno.Instantiate;
import com.xsy.springioc.service.UserService;

@Instantiate
public class UserController {

    @Devalue
    private UserService userService;

    public void add(){
        System.out.println("controller...");
        userService.add();
    }
}
