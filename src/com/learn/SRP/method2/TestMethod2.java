package com.learn.SRP.method2;

import org.junit.Test;

public class TestMethod2 {
    @Test
    public void test1(){
        ProductEntity pe = new ProductEntity();
        System.out.println("产品和查询功能：1、三星手机"+pe.getName("Samsung手机"));
        ProductService ps = new ProductService();
        System.out.println("2、查询 "+ ps.selectAll("查询"));
    }
}
