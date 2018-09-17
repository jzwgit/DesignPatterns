package com.learn.FactoryMethod;

import org.junit.Test;

// 测试类
public class TestMethod {
    @Test
    public void test1(){
        PraiseOneFactory oneFactory = new PraiseOneFactory();//实例化工厂类
        PraiseTwoFactory twoFactory = new PraiseTwoFactory();

        IXiaoMing xiaoMing1 = oneFactory.CreateXiaoMing();
        System.out.println("第一次表扬小明：");
        xiaoMing1.SkillOne();
        xiaoMing1.SkillTwo();
        xiaoMing1.Industry();

        IXiaoMing xiaoMing2 = twoFactory.CreateXiaoMing();
        System.out.println("第二次表扬小明：");
        xiaoMing2.SkillOne();
        xiaoMing2.SkillTwo();
        xiaoMing2.Industry();
    }
}
