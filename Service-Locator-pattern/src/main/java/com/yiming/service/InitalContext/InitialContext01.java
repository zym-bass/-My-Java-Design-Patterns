package com.yiming.service.InitalContext;

import com.yiming.service.impl.ServiceImpl1;
import com.yiming.service.impl.ServiceImpl2;

public class InitialContext01 {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("ServiceImpl1")){
            System.out.println("Looking up and creating a new ServiceImpl1 Object");
            return new ServiceImpl1();
        }else if(jndiName.equalsIgnoreCase("ServiceImpl2")){
            System.out.println("Looking up and creating a new ServiceImpl2 Object");
            return new ServiceImpl2();
        }
        return null;
    }
}
