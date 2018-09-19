package com.learn.Bridge;

/**
 * 别墅实现类：实现imageImpl并定义它的具体实现
 */
public class VillaImpl implements HouseImpl{
    @Override
    public String doShow(String strVilla) {
        String v = "别墅属于房子";
        System.out.println(strVilla+v);
        return v;
    }
}
