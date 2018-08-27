package com.learn.ISP;

public class Protal implements ICommodityForPortal {
    @Override
    public String getCommodity(String commodity) {
        String a = "查询";
//        System.out.println("类Protal实现接口ICommodity的查询方法");
        return a;
    }
}
