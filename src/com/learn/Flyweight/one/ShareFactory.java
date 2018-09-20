package com.learn.Flyweight.one;

import java.util.Hashtable;

/**
 * 享元工厂角色类
 * 属于FlyweightFactory角色
 */
public class ShareFactory {
    private Hashtable matter = new Hashtable();
    private Share share;
    public ShareFactory(){

    }
    //式样
    public Share factory(Character fettle){
        if(matter.containsKey(fettle)){
            return (Share)matter.get(fettle);
        }else{
            share = new ConcerteShare(fettle);
            matter.put(fettle,share);
            return share;
        }
    }
}
