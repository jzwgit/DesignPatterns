package com.learn.Decorator.traditional;

public class ExamineeRecorDetail extends ExamineeRecord {
    @Override
    public String record() {
        String a = "员工：小张  部门：市场部";
        String b = "考核情况：  平均分 3.5 2010年度考核分 3.6";
        String c = " ... ... ";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return a+b+c;
    }

    @Override
    public String signature(String name) {
        String a = "评价人签字：";
        System.out.println(a+name);
        return a+name;
    }
}
