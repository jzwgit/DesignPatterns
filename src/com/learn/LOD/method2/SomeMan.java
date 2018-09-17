package com.learn.LOD.method2;

//某男性特工
public class SomeMan {
    private LinkMan linkMan;//中间人
    public LinkMan getLinkMan(){
        return linkMan;
    }
    public void setLinkMan(LinkMan linkMan){
        this.linkMan=linkMan;
    }
    public void play(LinkMan linkMan){
        System.out.println("男特工联系中间人");
        linkMan.play();
    }
}
