package com.learn.Prototype;

//原型类
public abstract class AbstractPig implements Cloneable{
    public String pigName;
    public String getPigName(){
        return this.pigName;
    }
    public void setPigName(String pigName){
        this.pigName=pigName;
    }

    //重写clone（）方法
    public Object clone(){
        try{
            return super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("此对象不支持复制");
            e.fillInStackTrace();
        }
        return null;
    }
}
