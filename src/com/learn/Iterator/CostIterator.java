package com.learn.Iterator;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 具体迭代器
 */
public class CostIterator implements ICosIterator{

    //所有的项目都放在这里ArrayList中
    private ArrayList<ICost> costList = new ArrayList<ICost>();
    private int currentItem = 0;
    //构造函数出入costList
    public CostIterator(ArrayList<ICost> projectList){
        this.costList = projectList;
    }

    //判断是否还有元素，必须实现
    @Override
    public boolean hasNext() {
        //定义一个返回值
        boolean b = true;
        if(this.currentItem>=costList.size() || this.costList.get(this.currentItem) == null){
            b = false;
        }
        return b;
    }

    //取得下一个值
    @Override
    public ICost next() {
        return (ICost)this.costList.get(this.currentItem++);
    }

    //删除下一个对象
    @Override
    public void remove() {
        //暂时没有用到
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
