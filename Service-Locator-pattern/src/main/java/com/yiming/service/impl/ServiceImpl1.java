package com.yiming.service.impl;

import com.yiming.service.Service;

public class ServiceImpl1 implements Service {

    @Override
    public String getName() {
        return "ServiceImpl1";
    }

    @Override
    public void execute() {
        System.out.println("Executing ServiceImpl1");
    }

}
