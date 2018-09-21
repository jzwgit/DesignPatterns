package com.learn.ChainOfResponsibility;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        //先要组装责任链
        Approval a1 = new BusinessManager();
        Approval a2 = new TeamLeader();
        Approval a3 = new Cm();
        a3.setPass(a2);
        a2.setPass(a1);

        //测试
        String one = a3.handleMenuRequest("程序猿",29);
        System.out.println("程序猿29 : "+one);

        String two = a3.handleMenuRequest("业务员",29);
        System.out.println("业务员29 : "+two);

        String three = a3.handleMenuRequest("程序猿",40);
        System.out.println("程序猿40 : "+three);

        String four = a3.handleMenuRequest("业务员",40);
        System.out.println("业务员40 : "+four);

        String five = a3.handleMenuRequest("程序猿",55);
        System.out.println("程序猿55 : "+five);

        String six = a3.handleMenuRequest("业务员",55);
        System.out.println("业务员55 : "+six);
    }
}
