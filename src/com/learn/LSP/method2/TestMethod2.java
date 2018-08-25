package com.learn.LSP.method2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMethod2 {

    @Test
    public void test1(){
        //获取bean映射配置文件，将配置文件与所用当前测试类放置于同一目录结构中
        ApplicationContext ctx = new FileSystemXmlApplicationContext(getClass().getResource("jackbean.xml").toString());
        Cat cat = null;
        //白猫
        cat = (Cat)ctx.getBean("whiteCat");
        cat.catchMouse();
        cat.sleep();
        //黑猫
        cat = (Cat)ctx.getBean("blackCat");
        cat.catchMouse();
        cat.sleep();

    }

}
