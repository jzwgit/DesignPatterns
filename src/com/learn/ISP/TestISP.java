package com.learn.ISP;

import org.junit.Test;

public class TestISP {
    @Test
    public void test1(){
        Protal p = new Protal();
        System.out.println("类 Protal 的方法：");
        System.out.println(p.getCommodity("")+"\n");

        Admin a = new Admin();
        System.out.println("类 Admin 的方法：");

        System.out.print(a.insert(""));
        System.out.print(","+a.delete(""));
        System.out.print(","+a.update(""));
        System.out.println(","+a.getCommodity(""));

    }
}
