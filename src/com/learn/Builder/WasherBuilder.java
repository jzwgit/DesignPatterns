package com.learn.Builder;

public interface WasherBuilder {

    //建造冰箱的框架  抽象建造者：
    public void builderWasherSkeleton();

    //给冰箱装上压缩机
    public void buildeWasherEngine();

    //给冰箱装上轮子
    public void buildeWasherWheels();

    //安装冰箱身（冰箱门，颜色等）
    public void buildeWasherBody();
}
