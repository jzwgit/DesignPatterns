package com.learn.Facade;

/**
 * 店里营销业务接口
 */
public interface IElectricPowerMarketing {
    //代办用电变更
    public String electricityChange();
    //用电报修
    public String electricityBuild();
    //用电增容
    public String electricityAmplitude();
    //付费
    public String pay();
}
