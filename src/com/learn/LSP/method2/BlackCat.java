package com.learn.LSP.method2;

public class BlackCat implements Cat {

    @Override
    public void catchMouse() {
        System.out.println("黑猫抓老鼠");
    }

    @Override
    public void sleep() {
        System.out.println("黑猫睡觉了");
    }
}
