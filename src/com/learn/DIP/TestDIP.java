package com.learn.DIP;

import org.junit.Test;

public class TestDIP {
    @Test
    public void test1(){
        IEmployee employee = new Code();
        ICode code = new SeniorProgrammer();
        ICode code1 = new CommonProgrammer();
        //高级程序猿张三开始编码
        System.out.println("高级程序猿："+employee.code(code));
        //普通程序猿李四开始编码
        System.out.println("管理人员Boss派李四："+employee.code(code1));
    }
}
