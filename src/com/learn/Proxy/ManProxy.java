package com.learn.Proxy;

/**
 * 代理主题角色
 * jacking 代替开会者
 */
public class ManProxy implements ITraining {
    private ITraining training = null;
    //构造函数传递谁代替李东参加培训

    public ManProxy(ITraining _training) {
       this.training = _training;
    }

    @Override
    public String meeting(String employee, String team) {
        return this.training.meeting(employee,team);
    }

    //参与考试
    @Override
    public String joinTRaining() {
        return this.training.joinTRaining();
    }

    //参与培训
    @Override
    public String joinExam() {
        return this.training.joinExam();
    }
}
