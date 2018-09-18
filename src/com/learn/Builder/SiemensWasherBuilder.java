package com.learn.Builder;

public class SiemensWasherBuilder implements WasherBuilder {

    private SiemensWasher siemensWasher = new SiemensWasher();
    @Override
    public void builderWasherSkeleton() {
        siemensWasher.setWasherSkeleton("冰箱框架");
    }

    @Override
    public void buildeWasherEngine() {
        Compressor compressor = new Compressor("新型压缩机");
        siemensWasher.setWasherEngine(compressor);
    }

    @Override
    public void buildeWasherWheels() {
        siemensWasher.setWasherWheels("冰箱轮");
    }

    @Override
    public void buildeWasherBody() {
        siemensWasher.setWasherDoor("冰箱门");
        siemensWasher.setWasherColor("红色");
    }

    public SiemensWasher retrieveWasher(){
        return siemensWasher;
    }
}
