package com.learn.Bridge;

/**
 * 房子扩展类：扩充由Abstraction定义的接口
 */
public class ExtensionHouse extends House {

    @Override
    public String method(String strExtension) {
        String e = strExtension+"\nEXTENSION HOUSE";
        return this.houseImpl.doShow(e);
    }
}
