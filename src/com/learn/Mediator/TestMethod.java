package com.learn.Mediator;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        //具体中介者对象
        ConcreteMediator cm = new ConcreteMediator();
        //使两个具体同事类了解中介者对象
        Zhangsan zhangsan = new Zhangsan(cm);
        Lisi lisi = new Lisi(cm);
        //使中介者了解各个具体同事类对象
        cm.setZhangsan(zhangsan);
        cm.setLisi(lisi);
        zhangsan.send("我成绩班级第一哦");
        lisi.send("我是级部排名第六");
    }
}
