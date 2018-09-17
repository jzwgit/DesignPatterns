package com.learn.AbstractFactory;

public class GirlStudy implements IStudy {
    @Override
    public String doStudy() {
        String a = "女生学习";
        System.out.println(a);
        return a;
    }
}
