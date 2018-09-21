package com.learn.Proxy.springProxy;

public class Hi implements IHi {
    @Override
    public String info1(String A) {
        return "info1 : "+A;
    }

    @Override
    public String info2(String B) {
        return "info2 : "+B;
    }
}
