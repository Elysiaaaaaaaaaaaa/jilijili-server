package com.example.mspring.container;

import java.util.HashMap;
import java.util.Map;

/**
 *一个简单的bean容器，只有注册和获取方法
 */
public class BeanFactory {
    private Map<String,Object> beanMap = new HashMap<>();
    public void registerBean(String name,Object bean){
        beanMap.put(name,bean);
    }
    public Object getBean(String name){
        return beanMap.get(name);
    }
}
