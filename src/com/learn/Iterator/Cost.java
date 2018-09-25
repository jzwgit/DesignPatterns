package com.learn.Iterator;

import java.util.ArrayList;

/**
 * 具体聚合
 * 成本信息类 -- 具体聚合（ConcreteAggregate）
 */
public class Cost implements ICost{
    //定义一个成本列表
    private ArrayList<ICost> costArrayList = new ArrayList<ICost>();
    //成本内容
    private String content = "";
    //员工数量
    private int num = 0;
    //费用
    private int charge = 0;
    public Cost(){}

    public Cost(String content,int num,int charge){
        //赋值到类的成员变量中
        this.content = content;
        this.num = num;
        this.charge = charge;
    }

    //增加项目
    @Override
    public void add(String name, int num, int cost) {
        this.costArrayList.add(new Cost(name,num,cost));
    }

    //得到项目的信息
    @Override
    public String getProjectInfo() {
        String info = "";
        //成本内容
        info = info + "成本名称："+ this.content+"\t\t";
        //人力成本数
        info = info + "人力成本："+this.num+"\t\t";
        //费用
        info = info + "费用："+this.charge;
        return info;

    }

    //产生一个遍历对象
    @Override
    public ICosIterator interator() {
        return new CostIterator(this.costArrayList);
    }
}
