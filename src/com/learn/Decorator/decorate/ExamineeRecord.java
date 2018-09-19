package com.learn.Decorator.decorate;

/**
 * 考核抽象类
 * 考核报告 Component 定义一个对象接口，可以给这些对象动态的添加职责
 */
public abstract class ExamineeRecord {
    //考核情况显示
    public abstract String record();
    //需要评价人签字
    public abstract String signature(String name);
}
