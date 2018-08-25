package com.learn.DIP;

public class CommonProgrammer implements ICode {
    private static final String RUN = "李四";
    @Override
    public String getRun(String Run1) {
        String Run2 = "工作";
        System.out.println(RUN+"普通程序猿开始工作了 ...");
        return Run2;
    }
}
