package com.learn.Adapter;

public class produceCompanyImpl implements produceCompany {
    String a = null;
    @Override
    public String getShoe() {
        a = "shoe";
        return a;
    }

    @Override
    public String getDress() {
        a = "dress";
        return a;
    }
}
