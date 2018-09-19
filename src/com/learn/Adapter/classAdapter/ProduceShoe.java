package com.learn.Adapter.classAdapter;

//Adapter 适配器
public class ProduceShoe extends ProduceDress implements ProduceCompany{
    @Override
    public String getShoe() {
        System.out.println("-- 鞋 --");
        return "鞋子";
    }
}
