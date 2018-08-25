package com.learn.DIP;

public class SeniorProgrammer implements ICode {
    private static final String Run = "张三";
    @Override
    public String getRun(String Run1) {
        String Run2 = "工作";
        System.out.println(Run+"高级程序猿开始工作 ... ...");
        return Run2;
    }
}
