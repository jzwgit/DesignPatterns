package com.learn.FactoryMethod;

//表扬 2 （具体产品）
public class PriaseTwo implements IXiaoMing{

    @Override
    public void SkillOne() {
        System.out.println("提高了工作效率 -- 2");
    }

    @Override
    public void SkillTwo() {
        System.out.println("降低了原料成本 -- 2");
    }

    @Override
    public void Industry() {
        System.out.println("肯吃苦，勤劳 -- 2");
    }
}
