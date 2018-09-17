package com.learn.AbstractFactory;

public class GirlFactory implements IHumanFactory {
    @Override
    public IStudy getStudy() {
        return new GirlStudy();
    }

    @Override
    public IMakeMoney getMakeMoney() {
        return new GirlMakeMoney();
    }
}
