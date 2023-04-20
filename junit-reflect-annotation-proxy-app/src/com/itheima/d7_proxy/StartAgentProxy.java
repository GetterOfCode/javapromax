package com.itheima.d7_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StartAgentProxy {
    public static Skill getProxy(Start obj){
        return (Skill) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object rs = method.invoke(obj, args);
                return rs;
            }
        });
    }
}
