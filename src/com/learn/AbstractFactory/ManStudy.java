package com.learn.AbstractFactory;

public class ManStudy implements IStudy {
    @Override
    public String doStudy() {
        String a = "男生学习";
        System.out.println(a);
        return a;
    }
}
