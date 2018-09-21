package com.learn.Proxy.staticProxy;

/**
 * 抽象主题角色
 */
public interface ITraining {
    //进入培训讲座会议室
    public String meeting(String employee,String team);
    //参与培训
    public String joinTRaining();
    //参与考试
    public String joinExam();
}
