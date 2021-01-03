package com.yiming.service.serviceLoactor;

import com.yiming.service.InitalContext.InitialContext01;
import com.yiming.service.Service;
import com.yiming.service.cache.Cache01;

public class ServiceLocator01 {
    private static Cache01 cache;
    static {
        cache = new Cache01();
    }

    public static Service getService(String jndiName){
        
        Service service = cache.getService(jndiName);

        if (service!=null){
            return service;
        }

        InitialContext01 context = new InitialContext01();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return  service1;
    }
}
