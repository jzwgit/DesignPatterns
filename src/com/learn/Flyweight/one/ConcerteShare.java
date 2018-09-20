package com.learn.Flyweight.one;

/**
 * 具体享元角色类
 * 属于ConcerteFlyweight角色
 */
public class ConcerteShare implements Share {

    //内蕴状态
    private String internalFettle = null;
    //外蕴状态参数传进
    public ConcerteShare(String fettle){
        this.internalFettle = fettle;
    }

    public ConcerteShare(Character fettle) {

    }

    @Override
    public String work(String fettle) {
        String a = "internalFettle = "+internalFettle+", Exterior Fettle = ";
//        System.out.println(a);
        return a+fettle;
    }
}
