package com.learn.Facade;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        //上门服务人员 - 代办人
        PublicAgent publicAgent = new PublicAgent();
        System.out.println("上门服务："+publicAgent.sendElectricity());
    }
}
