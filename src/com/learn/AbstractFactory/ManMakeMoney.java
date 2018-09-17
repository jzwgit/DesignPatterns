package com.learn.AbstractFactory;

public class ManMakeMoney implements IMakeMoney {
    @Override
    public String doMakeMoney() {
        String a = "男生赚钱";
        System.out.println(a);
        return a;
    }
}
