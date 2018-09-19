package com.learn.Decorator.decorate;

/**
 * 装饰考核报告
 * Decorator - 维持一个纸箱Component 对象的指针，并定义一个与Component接口一致的接口
 */
public abstract class Decorator extends ExamineeRecord {
    //考核报告
    private ExamineeRecord er;
    //用于传送考核报告的构造函数
    public Decorator(ExamineeRecord er){
        this.er = er;
    }
    //显示考核报告
    public String record(){
        return this.er.record();
    }
    //评价人签字
    public String signature(String name){
        return this.er.signature(name);
    }
}
