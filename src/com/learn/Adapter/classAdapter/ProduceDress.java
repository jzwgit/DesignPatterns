package com.learn.Adapter.classAdapter;

//Adaptee 被适配器
public class ProduceDress {
    public String getDress(){
        System.out.println("-- 服装 --");
        return "服装";
    }
}
