package com.learn.Command;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        //将命令和真正的实现组合起来，也就是组装机器，将豆浆机功能键上的连接线与电路相连。
        Icircuit icircuit = new Circuit();
        StartupCommand startupCommand = new StartupCommand(icircuit);
        //为豆浆机的功能键设置对应的命令，使功能键与命令相匹配。
        SoyMilkGrinder soyMilkGrinder = new SoyMilkGrinder();
        soyMilkGrinder.setStartupCommand(startupCommand);
        //按下豆浆机上的功能键
        System.out.println(soyMilkGrinder.startupFunction());
    }
}
