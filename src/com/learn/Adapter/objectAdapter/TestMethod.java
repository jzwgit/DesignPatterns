package com.learn.Adapter.objectAdapter;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        //创建一个对象
        ProduceShoe p = new ProduceShoe(null);
        p.getShoe();
        p.getDress();
    }
}
