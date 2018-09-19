package com.learn.Adapter.classAdapter;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        //创建一个对象
        ProduceShoe p = new ProduceShoe();
        System.out.println("原有产品业务："+p.getShoe());
        System.out.println("新增的产品："+p.getDress());
    }
}
