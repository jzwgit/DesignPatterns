package com.learn.Bridge;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        HouseImpl villaimpl = new VillaImpl();
        ExtensionHouse extensionHouse = new ExtensionHouse();
        extensionHouse.setHouseImpl(villaimpl);
        extensionHouse.method("show 1 : ");
        System.out.println("房子类别："+extensionHouse.method("show 1 : "));

        HouseImpl flatimp = new FlatImpl();
        extensionHouse.setHouseImpl(flatimp);
        extensionHouse.method("show 2 : ");
        System.out.println(extensionHouse.method("show 2 : "));
    }
}
