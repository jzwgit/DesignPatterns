package com.learn.LOD.method2;

import org.junit.Test;

//完成任务
public class SuccessRun {
    @Test
    public void main(){
        SomeMan jack = new SomeMan();//生成男特工
        jack.setLinkMan(new LinkMan());//男特工找到他的联络人
        jack.getLinkMan().play();//联络人接收到男特工的请求，并准备完毕
        jack.getLinkMan().playWithSomeGirl();//联络人联系到女特工，女特工进行了任务
    }
}
