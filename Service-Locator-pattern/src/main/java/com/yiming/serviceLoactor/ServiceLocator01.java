package com.yiming.serviceLoactor;

import com.yiming.InitalContext.InitialContext01;
import com.yiming.service.Service;
import com.yiming.cache.Cache01;

//服务定位器
public class ServiceLocator01 {
    //创建对应的缓存对象
    private static Cache01 cache;

    //在类加载的时候 创建对象
    static {
        cache = new Cache01();
    }

    //获取Service的实体类，该方法使用了缓存对象和初始化环境对象，
    //当缓存没有时，调用初始化环境，进行初始化，并添加进缓存对象中的容器中
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
