package com.learn.AbstractFactory;

public class ManFactory implements IHumanFactory {
    @Override
    public IStudy getStudy() {
        return new ManStudy();
    }

    @Override
    public IMakeMoney getMakeMoney() {
        return new ManMakeMoney();
    }
}
