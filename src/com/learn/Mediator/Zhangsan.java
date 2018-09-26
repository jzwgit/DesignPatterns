package com.learn.Mediator;

/**
 * 具体同事类
 * 具体同事对象1，其他角色必须了解对应的具体中介角色，以便与其他同事角色通讯时，通过中介者角色实现协作。
 */
public class Zhangsan extends Schoolgirl{
    public Zhangsan(Mediator mediator) {
        super(mediator);
    }

    public String send(String info){
        //发送消息时通常由中介者发送出去
        return mediator.send(info,this);
    }
    public String notifyInfo(String info){
        String a = "张三说：";
        System.out.println(a+info);
        return a+info;
    }
}
