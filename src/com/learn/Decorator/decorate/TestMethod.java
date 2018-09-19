package com.learn.Decorator.decorate;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test(){
        ExamineeRecord er;
        er = new YearExamineeRecord();//员工现有考核情况
        //部门考核最高分
        er = new TipTopPointDecorator(er);
        //考核排名
        er = new OrderDecorator(er);
        //考核情况显示
//        er.record();
//        er.signature("李四");
        System.out.println("查看考核情况："+er.record());
        System.out.println("签字："+er.signature("王五"));

    }
}
