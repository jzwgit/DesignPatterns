package com.learn.AbstractFactory;

public class GirlMakeMoney implements IMakeMoney {
    @Override
    public String doMakeMoney() {
        String a = "女生赚钱";
        System.out.println(a);
        return a;
    }
}
