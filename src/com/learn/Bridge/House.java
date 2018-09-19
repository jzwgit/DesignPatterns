package com.learn.Bridge;

// Abstraction 定义抽象类的接口，维护一个指向实现者（implementor）接口类型（HouseImpl）的指针
public abstract class House {
    protected HouseImpl houseImpl;
    public String setHouseImpl(HouseImpl houseImpl1){
        houseImpl = houseImpl1;
        return null;
    }
    public abstract String method(String str);

}
