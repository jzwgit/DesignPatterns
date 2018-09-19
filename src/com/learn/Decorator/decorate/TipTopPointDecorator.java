package com.learn.Decorator.decorate;

public class TipTopPointDecorator extends Decorator {
    //构造函数
    public TipTopPointDecorator(ExamineeRecord er) {
        super(er);
    }

    //部门最高考核分数情况
    private String reportHighScore(){
        String a = "此次考核，最高平均分为4.2， 2010年度最高考核分为4.1";
        System.out.println(a);
        return a;
    }

    //部门最高考核分与员工的考核分
    public String record(){
        this.reportHighScore();
        super.record();
        return this.reportHighScore()+super.record();
    }
}
