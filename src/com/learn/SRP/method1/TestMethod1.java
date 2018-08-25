package com.learn.SRP.method1;

import org.junit.Test;

public class TestMethod1 {
    @Test
    public void test1(){
        ProductEntity productEntity = new ProductEntity();
        System.out.println("产品名称：1.TCL"+productEntity.getName("TCL"));
        System.out.println("2.三星"+productEntity.getName("三星"));
        System.out.println("3.苹果"+productEntity.getName("苹果"));
    }
}
