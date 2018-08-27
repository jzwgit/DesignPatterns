package com.learn.LOD.method1;

//中间人
public class LinkMan {
    public void play(){
        System.out.println("introducer ok");
    }
    public void playWithSomeGirl(){
        SomeGirl someGirl = new SomeGirl();
        someGirl.play();
    }
}
