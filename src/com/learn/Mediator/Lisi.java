package com.learn.Mediator;

/**
 * 具体同事类
 * 具体同事对象2，其他角色必须了解对应的具体中介角色，以便与其他同事角色通讯时，通过中介者角色实现协作。
 */
public class Lisi extends Schoolgirl{
    public Lisi(Mediator mediator) {
        super(mediator);
    }

    public String send(String info){
        //发送消息时通常由中介者发送出去
        return mediator.send(info,this);
    }
    public String notifyInfo(String info){
        String a = "李四说：";
        System.out.println(a+info);
        return a+info;
    }
}
