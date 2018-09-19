package com.learn.Composite;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 客户端测试类
 * 展现树形结构：
 * 一级节点是 排长（platoonOfficer），二级节点是副排长（platoonSergeant），三级节点是班长（monitor）
 */
public class ClientCase {
    //实现树型结构
    public static Node compositeNodeTree(){
        //一级节点：排长
        Node node = new Node("杰克","排长","A001");
        //二级节点：两个副排长
        Node platoonSergeant1 = new Node("李东","副排长","A002");
        Node platoonSergeant2 = new Node("蒋飞","副排长","A003");
        //三级节点：班长
        Monitor A002_1 = new Monitor("陈晓晓","班长","A002_1");
        Monitor A002_2 = new Monitor("李梅","班长","A002_2");
        Monitor A002_3 = new Monitor("司徒青云","班长","A002_3");
        Monitor A003_1 = new Monitor("金虹","班长","A003_1");
        Monitor A003_2 = new Monitor("麻小遇","班长","A003_2");
        Monitor A003_3 = new Monitor("林东桥","班长","A003_3");

        //设置下级---------------
        //排长下属两个副排长
        node.addJunior(platoonSergeant1);
        node.addJunior(platoonSergeant2);
        //两个副排长的下属
        platoonSergeant1.addJunior(A002_1);
        platoonSergeant1.addJunior(A002_2);
        platoonSergeant1.addJunior(A002_3);
        platoonSergeant2.addJunior(A003_1);
        platoonSergeant2.addJunior(A003_2);
        platoonSergeant2.addJunior(A003_3);

        return node;
    }

    //为了遍历全树，需要通过根节点，遍历出所有的节点
    public static String getTreeMessage(Node node){
        ArrayList<Group> juniorList = node.getJunior();
        String message = "";
        for(Group g : juniorList){
            if(g instanceof Monitor){
                message = message+g.getMessage()+"\n";
            }else{
                //是个有下属的军官
                message = message +g.getMessage()+"\n"+getTreeMessage((Node) g);
            }
        }
        return message;
    }

    //测试方法，打印信息
    @Test
    public void test1(){
        //实现树形结构
        Node platoonOfficer = compositeNodeTree();
        //一级节点：排长
        System.out.println(platoonOfficer.getMessage());

        System.out.println("---------------------------------");

        //除排长外其他所有军官信息
        System.out.println(getTreeMessage(platoonOfficer));
    }

}
