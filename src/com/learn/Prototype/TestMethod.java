package com.learn.Prototype;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        AbstractPig pig = new SonPig();
        System.out.println(pig.getPigName());

        //通过对象的clone()方法，即可获得对象的一个copy
        AbstractPig pig1 = (AbstractPig)pig.clone();
        System.out.println("拷贝："+pig1.getPigName());
    }
}
