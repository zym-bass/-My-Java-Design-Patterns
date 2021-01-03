package com.yiming.Test;

import com.yiming.service.Service;
import com.yiming.serviceLoactor.ServiceLocator01;

public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {

        Service service = ServiceLocator01.getService("ServiceImpl1");
        service.execute();
        service = ServiceLocator01.getService("ServiceImpl2");
        service.execute();
        service = ServiceLocator01.getService("ServiceImpl1");
        service.execute();
        service = ServiceLocator01.getService("ServiceImpl2");
        service.execute();
        /*
            Looking up and creating a new ServiceImpl1 Object
            Executing ServiceImpl1
            Looking up and creating a new ServiceImpl2 Object
            Executing ServiceImpl2
            Returning cached ServiceImpl1 Object
            Executing ServiceImpl1
            Returning cached ServiceImpl2 Object
            Executing ServiceImpl2
        */
    }
}
