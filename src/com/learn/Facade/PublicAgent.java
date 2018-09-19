package com.learn.Facade;

/**
 * 代办人（门面类）
 */
public class PublicAgent {
    private IElectricPowerMarketing electricPowerMarketing = new ElectricPowerMarketingImpl();

    //上门服务人员，为孤寡残疾老人提供代办用电变更、用电报修、用电增容、付费业务一体化服务。
    public String sendElectricity(){
        //代办用电变更
        electricPowerMarketing.electricityChange();
        //代办用电报修
        electricPowerMarketing.electricityBuild();
        //代办用电增容
        electricPowerMarketing.electricityAmplitude();
        //付费
        electricPowerMarketing.pay();
        return electricPowerMarketing.electricityChange()+electricPowerMarketing.electricityBuild()+
                electricPowerMarketing.electricityAmplitude()+electricPowerMarketing.pay();
    }
}
