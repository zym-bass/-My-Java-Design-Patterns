package com.yiming.cache;

import com.yiming.service.Service;
import java.util.ArrayList;
import java.util.List;

public class Cache01 {
    //缓存容器 用于存放已经使用过的service实现类
    private List<Service> services;

    //初始化容器
    public Cache01() {
        services = new ArrayList<Service>(){};
    }

    //获取对应Service接口实现类，使用的服务定位器中，返回为null时，即没有使用过，即缓存容器没有，需要初始化
    public Service getService(String serviceName){
        for (Service service : services){
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached "+serviceName+" Object");
                return service;
            }
        }
        return null;
    }

    //将第一次使用过的Service实现类(就是缓存容器里没有的)添加到缓存容器中
    public void  addService(Service newService){
        //判断缓存容器中是否有其service实现类，false添加，true不添加
        boolean exists = false;

        for (Service service :services){
            if (service.getName().equalsIgnoreCase(newService.getName())){
                exists=true;
            }
        }

        if (!exists){
            //如果exists为空,添加到缓存容器中
            services.add(newService);
        }
    }
}
