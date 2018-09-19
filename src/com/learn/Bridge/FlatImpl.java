package com.learn.Bridge;

/**
 * 公寓实现类：实现imageImpl 并定义他的具体实现
 */
public class FlatImpl implements HouseImpl{

    @Override
    public String doShow(String strFlat) {
        String a = "公寓属于房子";
        System.out.println(strFlat+"公寓属于房子");
        return a;
    }
}
