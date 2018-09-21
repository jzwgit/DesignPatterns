package com.learn.Proxy.springProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyHi implements InvocationHandler {
    //需要处理的相关的对象，例如Hi
    private Object delegate;
    //可以动态的创建方法被处理之后的有关对象
    public Object bind(Object delegate){
        this.delegate = delegate;
        return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(),
                this.delegate.getClass().getInterfaces(),this);
    }
    //需要处理对象的各个方法均由此方法与JVM调用。（动态方法）
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object fruit = null;
        try{
            //本条语句交于JVM执行原有方法（即反射机制）
            fruit = method.invoke(this.delegate,args);
        }catch (Exception e){
            e.printStackTrace();
        }
        //将返回方法与返回值交于调用方
        return fruit;
    }
}
