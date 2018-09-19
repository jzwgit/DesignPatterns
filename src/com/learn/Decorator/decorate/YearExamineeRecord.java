package com.learn.Decorator.decorate;

/**
 * 员工考核类
 * ConcreteComponent - 定义一个对象，可以给这个对象添加一些职责
 * 员工小张的考核情况
 */
public class YearExamineeRecord extends ExamineeRecord{
    //员工小张的考核情况
    @Override
    public String record() {
        String a1 = "员工：小张  部门：研发部";
        String b1 = "考核情况：  平均分 3.5 2010年度考核分 3.6";
        String c1 = " ... ... ";
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        return a1+b1+c1;
    }

    @Override
    public String signature(String name) {
        String a = "评价人：";
        System.out.println(a+name);
        return a+name;
    }
}
