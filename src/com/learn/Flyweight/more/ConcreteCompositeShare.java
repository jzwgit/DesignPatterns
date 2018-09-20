package com.learn.Flyweight.more;

import com.learn.Flyweight.one.Share;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * 复合享元角色
 * UnsharebleFlyweight 角色
 */
public class ConcreteCompositeShare implements Share {

    private Hashtable matter = new Hashtable(10);
    private Share share;
    public ConcreteCompositeShare(){}
    //添加一个新的单纯享元对象到聚集中
    public void add (Character key,Share share){
        matter.put(key,share);
    }
    //传入外蕴状态
    public String work(String exteriiorFettle){
        Share share = null;
        for(Iterator iterator = matter.entrySet().iterator();iterator.hasNext();){
            Map.Entry e = (Map.Entry)iterator.next();
            share = (Share)e.getValue();
            share.work(exteriiorFettle);//外蕴状态
        }
        return exteriiorFettle;
    }
}
