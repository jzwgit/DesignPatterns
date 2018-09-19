package com.learn.Decorator.traditional;

/**
 * 考核情况抽象类
 * @author Administrator
 */
public abstract class ExamineeRecord {
    //小张考核情况
    public abstract String record();
    //评价人签字
    public abstract String signature(String name);
}
