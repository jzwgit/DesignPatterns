package com.learn.Proxy.staticProxy;

/**
 * 真实代理对象
 * 真实实现类
 */
public class LidongTraining implements ITraining{

    private String name = "";
    //通过构造函数传递名称

    public LidongTraining(String _name) {
        this.name = _name;
    }

    //参加培训讲座会议室，前提
    @Override
    public String meeting(String employee, String team) {
        String a = "参会者名为";
        String b = "的员工";
        String c = "进入会议室成功!";
        System.out.println(a+employee+b+this.name+c);
        return a+employee+b+this.name+c;
    }

    @Override
    public String joinTRaining() {
        String joinTraining = "正在考试";
        System.out.println(this.name+joinTraining);
        return this.name+joinTraining;
    }

    @Override
    public String joinExam() {
        String joinExam = "正在培训";
        System.out.println(this.name+joinExam);
        return this.name+joinExam;
    }
}
