package com.learn.Adapter.tradition;

import org.junit.Test;

public class TestTradition {

    @Test
    public void test1(){
        //创建一个对象
        produceCompanyImpl obj = new produceCompanyImpl();

        System.out.println("公司新的业务："+obj.getDress());
        System.out.println("原有业务："+obj.getShoe());
    }
}
