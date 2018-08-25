package com.learn.LSP.method2;

public class WhiteCat implements Cat {

    @Override
    public void catchMouse() {
        System.out.println("白猫抓老鼠");
    }

    @Override
    public void sleep() {
        System.out.println("白猫在睡觉");
    }
}
