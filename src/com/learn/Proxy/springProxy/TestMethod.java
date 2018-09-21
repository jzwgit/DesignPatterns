package com.learn.Proxy.springProxy;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        IHi hi = (IHi)new DynaProxyHi().bind(new Hi());
        System.out.println(hi.info1("A"));
        System.out.println(hi.info2("B"));
    }
}
