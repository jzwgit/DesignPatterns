package com.learn.Flyweight.more;

import com.learn.Flyweight.one.Share;
import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        ShareFactory factory = new ShareFactory();
        Share share = factory.factory("东西南",'1');
        System.out.println("内蕴东西南不同，外蕴君威字体："+share.work("宋体"));
        System.out.print("这是我用手机写出来了明眸更名你");
    }
}
