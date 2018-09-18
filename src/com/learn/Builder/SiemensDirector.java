package com.learn.Builder;

/*
    西门子电器的导演者
    职责：指导建造者以一定的方式生产西门子冰箱
 */
public class SiemensDirector {
    WasherBuilder builder;

    //为导演者配置一个建造者
    public SiemensDirector(WasherBuilder builder){
        this.builder=builder;
    }

    //按照一定的方式或规则建造冰箱
    public void contruct(){
        builder.builderWasherSkeleton();
        builder.buildeWasherEngine();
        builder.buildeWasherWheels();
        builder.buildeWasherBody();
    }
}
