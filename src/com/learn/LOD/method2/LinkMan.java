package com.learn.LOD.method2;

//中间联络人
public class LinkMan {
    public void play(){
        System.out.println("中间人准备完毕");
    }
    public String playWithSomeGirl(){
        SomeGirl someGirl = new SomeGirl();
        String a = "中间人联系女特工";
        System.out.println(a);
        return someGirl.play(a);
    }
}
