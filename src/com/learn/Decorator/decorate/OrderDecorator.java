package com.learn.Decorator.decorate;

public class OrderDecorator extends Decorator {
    //构造方法
    public OrderDecorator(ExamineeRecord er) {
        super(er);
    }

    //员工在部门的排名情况
    private String recordOrader(){
        String a = "部门排名第7";
        System.out.println(a);
        return a;
    }

    //查看考核分数与部门排名
    public String record(){
        super.record();
        this.recordOrader();
        return super.record()+this.recordOrader();
    }
    
}
