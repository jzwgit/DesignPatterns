package com.learn.Decorator.traditional;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        //考核情况
        ExamineeRecord er = new TipTopPointReport();
        System.out.println("查看考核情况："+er.record());
        System.out.println("签字："+er.signature("李四"));
    }

}
