package com.learn.DIP;

public class Code implements IEmployee {
    private static final String Run = "编写代码";
    @Override
    public String code(ICode iCode) {
        System.out.println(iCode+"程序猿开始编写代码... ...");
        return iCode.getRun(Run);
    }
}
