package com.learn.OCP.pojo;

import com.learn.OCP.interfac.IShoe;

public class BoyShoe implements IShoe {
    private String name;    //男鞋名
    private String type;    //男鞋类
    private int value;      //男鞋价格

    public BoyShoe(String name1,String type1,int value1){
        this.name=name1;
        this.type=type1;
        this.value=value1;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
