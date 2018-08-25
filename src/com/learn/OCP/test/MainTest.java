package com.learn.OCP.test;

import com.learn.OCP.pojo.PriceCutBoyShoe;
import com.learn.OCP.pojo.PriceCutGirlShoe;
import org.junit.Test;

public class MainTest {
    @Test
    public void test1(){
        PriceCutBoyShoe boy = new PriceCutBoyShoe("滑板鞋","男板鞋",161);
        System.out.println("打折后的滑板鞋价格："+boy.getValue());
        PriceCutGirlShoe girl = new PriceCutGirlShoe("细跟小脚鞋","女高跟鞋",283);
        girl.setValue(299);
        System.out.println("打折后的小脚鞋价格："+girl.getValue());
    }
}
