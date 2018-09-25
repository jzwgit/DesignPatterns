package com.learn.Iterator;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        //定义一个List，存放所有的项目对象
        ICost cost = new Cost();
        //采购支出
        cost.add("采购",10,1000);
        //人力支出
        cost.add("人力",100,10000);
        //纳税支出
        cost.add("纳税",2,500);
        //这边10个项目
        for(int i = 1;i<=10;i++){
            cost.add("第"+i+"个支出",i*5,i*100);
        }
        //遍历一下ArrayList,把所有的数据都取出
        ICosIterator projectIterator = cost.interator();
        while(projectIterator.hasNext()){
            ICost p = (ICost)projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
