package com.learn.ISP;

public class Admin implements ICommodityForAdmin {


    @Override
    public String insert(String insert) {
//        System.out.println("类Admin 实现接口 ICommodity 的插入方法");
        return "插入";
    }

    @Override
    public String delete(String delete) {
//        System.out.println("类Admin 实现接口 ICommodity 的删除方法");
        return "删除";
    }

    @Override
    public String update(String update) {
//        System.out.println("类Admin 实现接口 ICommodity 的修改方法");
        return "修改";
    }

    @Override
    public String getCommodity(String commodity) {
//        System.out.println("类Admin 实现接口 ICommodity 的查询方法");
        return "查询";
    }
}
