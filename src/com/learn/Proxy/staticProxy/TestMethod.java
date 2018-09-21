package com.learn.Proxy.staticProxy;

import org.junit.Test;

import java.util.Date;

public class TestMethod {
    //测试类
    @Test
    public void test1(){

        //定义参会者lidong
        ITraining lidong = new LidongTraining("李东");
        //然后再定义一个代练者
        ITraining proxy = new ManProxy(lidong);
        //开始培训，记下时间戳
        System.out.println("开始时间："+new Date());
        //参加培训会的人
        proxy.meeting("李东","team");
        //参加培训
        proxy.joinTRaining();
        //考试
        proxy.joinExam();
        System.err.println("结束时间："+new Date());

    }
}
