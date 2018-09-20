package com.learn.Flyweight.more;

import com.learn.Flyweight.one.ConcerteShare;
import com.learn.Flyweight.one.Share;

import java.util.Hashtable;

/**
 * 享元工厂角色
 * 属于FlyweightFactory角色
 */
public class ShareFactory {
     private Hashtable matter = new Hashtable();
     public ShareFactory(){}
     //单纯享元工厂方法，所需状态以参量形式传入
    public Share factory(String 东西南, Character fettle){
         if(matter.containsKey(fettle)){
             return (Share)matter.get(fettle);
         }else{
             Share share = new ConcerteShare(fettle);
             matter.put(fettle,share);
             return share;
         }
    }
    //享元工厂方法，运用String参量传入状态
    public Share factory1(String compositeState){
        ConcreteCompositeShare concreteCompositeShare = new ConcreteCompositeShare();
        int length = compositeState.length();
        Character fettle = null;
        for(int i = 0;i<length;i++){
            fettle = new Character(compositeState.charAt(i));
            System.out.println("factory("+fettle+")");
            concreteCompositeShare.add(fettle,this.factory("东西南", fettle));
        }
        return concreteCompositeShare;
    }
}
