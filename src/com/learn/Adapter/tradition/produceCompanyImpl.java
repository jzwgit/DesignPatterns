package com.learn.Adapter.tradition;

public class produceCompanyImpl implements produceCompany {
    String a = null;
    @Override
    public String getShoe() {
        a = "生产鞋子";
        return a;
    }

    @Override
    public String getDress() {
        a = "生产衣服";
        return a;
    }
}
