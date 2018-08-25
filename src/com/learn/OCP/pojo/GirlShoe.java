package com.learn.OCP.pojo;

import com.learn.OCP.interfac.IShoe;

public class GirlShoe implements IShoe {
    private String name;    //女鞋名
    private String type;    //女鞋类
    private int value;      //女鞋价格
    public GirlShoe(String name2,String type2,int value2){
        this.name=name2;
        this.type=type2;
        this.value=value2;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
