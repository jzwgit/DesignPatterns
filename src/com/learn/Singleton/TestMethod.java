package com.learn.Singleton;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){

        //运用饿汉模式的单例模式，来调用类的实例
        System.out.println("1. 饿汉式单例模式调用类的实例：");
        System.out.println("****************************");
        for(int i = 0;i<5;i++){
            int a = i+1;
            System.out.println("第"+a+"次得到的对象值为:"+JackSingleton.getInstance());
        }

        //运用懒汉模式的单例模式，来调用类的实例
        System.out.println("2. 懒汉式单例模式调用类的实例：");
        System.out.println("***************************");
        for(int i = 0;i<5;i++){
            int a = i+1;
            System.out.println("第"+a+"次得到的对象值为:"+JackSingletonOne.getInstance());
        }

        //不使用单例模式，来调用类的实例
        System.out.println("3. 非单例模式调用类的实例：");
        System.out.println("************************");
        for (int i=0;i<5;i++){
            int a= i+1;
            NoName noName = new NoName();
            System.out.println("第"+a+"次得到的对象值为："+noName);

        }
    }
}
