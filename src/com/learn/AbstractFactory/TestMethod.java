package com.learn.AbstractFactory;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        IHumanFactory manStudyFactory = new ManFactory();
        manStudyFactory.getStudy().doStudy();
        IHumanFactory girlStudyFactory = new GirlFactory();
        girlStudyFactory.getStudy().doStudy();
        IHumanFactory manMakeMoneyFactory = new ManFactory();
        manMakeMoneyFactory.getMakeMoney().doMakeMoney();
        IHumanFactory girlMakeMoneyFactory = new GirlFactory();
        girlMakeMoneyFactory.getMakeMoney().doMakeMoney();

//        System.out.println("manStudyFactory:"+manStudyFactory.getStudy().doStudy());
//        System.out.println("girlStudyFactory:"+girlStudyFactory.getStudy().doStudy());
//        System.out.println("manMakeMoneyFactory:"+manMakeMoneyFactory.getMakeMoney().doMakeMoney());
//        System.out.println("girlMakeMoneyFactory:"+girlMakeMoneyFactory.getMakeMoney().doMakeMoney());

    }
}
