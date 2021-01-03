package com.yiming.service.cache;

import com.yiming.service.Service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Cache01 {
    private List<Service> services;

    public Cache01() {
        services = new ArrayList<Service>(){};
    }

    public Service getService(String serviceName){
        for (Service service : services){
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached "+serviceName+" Object");
                return service;
            }
        }
        return null;
    }

    public void  addService(Service newService){
        boolean exists = false;
        for (Service service :services){
            if (service.getName().equalsIgnoreCase(newService.getName())){
                exists=true;
            }
        }
        if (!exists){
            services.add(newService);
        }
    }
}