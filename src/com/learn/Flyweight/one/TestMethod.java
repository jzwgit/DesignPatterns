package com.learn.Flyweight.one;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        ShareFactory factory = new ShareFactory();
        Share share = factory.factory(new Character('中'));
        System.out.println("字体："+share.work("黑体"));
        System.out.println("字体："+share.work("宋体"));
        share = factory.factory(new Character('外'));
        System.out.println("字体："+share.work("仿宋"));
    }
}
