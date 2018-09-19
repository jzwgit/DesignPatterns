package com.learn.Decorator.traditional;

/**
 * 告知员工部门最高考核分
 */
public class TipTopPointReport extends ExamineeRecorDetail {
    public String bestRecord(){
        String a = "此次考核，最高平均分为4.2,2010年度最高考核分为4.1";
        System.out.println(a);
        return a;
    }
    public String deporder(){
        String b = "部门排名第7";
        System.out.println(b);
        return b;
    }
    public String record(){
        this.bestRecord();
        super.record();
        this.deporder();
        return this.bestRecord()+super.record()+this.deporder();
    }

}
