package com.learn.LOD.method1;

import org.junit.Test;

public class SuccessRun {
    @Test
    public void test1(){
        SomeMan tom = new SomeMan();
        tom.setLinkMan(new LinkMan());
        tom.getLinkMan().play();
        tom.getLinkMan().playWithSomeGirl();
    }
}
