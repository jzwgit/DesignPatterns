package com.learn.AbstractFactory;

//人类工厂接口
public interface IHumanFactory {
    IStudy getStudy();
    IMakeMoney getMakeMoney();

}
