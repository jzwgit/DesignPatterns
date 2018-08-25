package com.learn.LSP.method1;

import org.junit.Test;

public class TestMethod1 {
    @Test
    public void test1(){
        SuperLiskov ob = new SubLiskov();
        ob.a1();
        ob.a2();
        System.out.println("结果为："+(ob.a));
    }
}
