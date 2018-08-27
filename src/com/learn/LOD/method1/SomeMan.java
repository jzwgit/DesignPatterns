package com.learn.LOD.method1;

//男性特务
public class SomeMan {
    private LinkMan linkMan;
    public LinkMan getLinkMan(){
        return linkMan;
    }
    public void setLinkMan(LinkMan linkMan){
        this.linkMan = linkMan;
    }
    public void play(){
        System.out.println("someman ok");
        linkMan.play();
    }
}
