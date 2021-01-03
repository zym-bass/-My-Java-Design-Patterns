package com.yiming.service.impl;

import com.yiming.service.Service;

public class ServiceImpl2  implements Service {

    @Override
    public String getName() {
        return "ServiceImpl2";
    }

    @Override
    public void execute() {
        System.out.println("Executing ServiceImpl2");
    }
}
