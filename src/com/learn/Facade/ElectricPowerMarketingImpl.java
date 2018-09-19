package com.learn.Facade;

/**
 * 店里营销业务实现类
 * 用电变更、用电报修、用电增容、付费业务
 */
public class ElectricPowerMarketingImpl implements IElectricPowerMarketing {

    @Override
    public String electricityChange() {
        String a = "代办用电变更...";
        System.out.println(a);
        return a;
    }

    @Override
    public String electricityBuild() {
        String b = "代办用电报修...";
        System.out.println(b);
        return b;
    }

    @Override
    public String electricityAmplitude() {
        String c = "代办用电增容...";
        System.out.println(c);
        return c;
    }

    @Override
    public String pay() {
        String d = "代办付费...";
        System.out.println("代办付费...");
        return d;
    }
}
