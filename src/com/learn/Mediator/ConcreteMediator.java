package com.learn.Mediator;

/**
 * 具体中介者类，通过了解全体具体同事对象来协调各同事角色，从而达到协作的目标
 */
public class ConcreteMediator extends Mediator{
    //具体同事对象1
    private Zhangsan zhangsan;
    //具体同事对象2
    private Lisi lisi;

    //重写发送消息方法，以对象为依据进行选择判断，从而达到通知对象的目的
    @Override
    public String send(String info, Schoolgirl schoolgirl) {
        if(schoolgirl == zhangsan){
            lisi.notifyInfo(info);
        }else{
            zhangsan.notifyInfo(info);
        }
        return info+schoolgirl.toString();
    }

    public Zhangsan getZhangsan() {
        return zhangsan;
    }

    public void setZhangsan(Zhangsan zhangsan) {
        this.zhangsan = zhangsan;
    }

    public Lisi getLisi() {
        return lisi;
    }

    public void setLisi(Lisi lisi) {
        this.lisi = lisi;
    }
}
