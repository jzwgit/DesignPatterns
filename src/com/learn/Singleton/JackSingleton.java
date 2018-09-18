package com.learn.Singleton;

//懒汉模式单例
public class JackSingleton {
    private static final JackSingleton jackSingleton = new JackSingleton();
    private JackSingleton(){

    }

    public synchronized static JackSingleton getInstance(){
        return jackSingleton;
    }
}
