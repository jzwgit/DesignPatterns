package com.learn.Builder;

//产品  西门子冰箱
public class SiemensWasher {
    private String washerSkeleton;
    private Compressor washerEngine;
    private String washerWheels;
    private String washerDoor;
    private String washerColor;
    public SiemensWasher(){}

    public String getWasherSkeleton() {
        return washerSkeleton;
    }

    public void setWasherSkeleton(String washerSkeleton) {
        this.washerSkeleton = washerSkeleton;
    }

    public Compressor getWasherEngine() {
        return washerEngine;
    }

    public void setWasherEngine(Compressor washerEngine) {
        this.washerEngine = washerEngine;
    }

    public String getWasherWheels() {
        return washerWheels;
    }

    public void setWasherWheels(String washerWheels) {
        this.washerWheels = washerWheels;
    }

    public String getWasherDoor() {
        return washerDoor;
    }

    public void setWasherDoor(String washerDoor) {
        this.washerDoor = washerDoor;
    }

    public String getWasherColor() {
        return washerColor;
    }

    public void setWasherColor(String washerColor) {
        this.washerColor = washerColor;
    }

    @Override
    public String toString() {
        return "SiemensWasher{" +
                "washerSkeleton='" + washerSkeleton + '\'' +
                ", washerEngine=" + washerEngine +
                ", washerWheels='" + washerWheels + '\'' +
                ", washerDoor='" + washerDoor + '\'' +
                ", washerColor='" + washerColor + '\'' +
                '}';
    }
}
