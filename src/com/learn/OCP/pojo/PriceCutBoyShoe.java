package com.learn.OCP.pojo;

public class PriceCutBoyShoe extends BoyShoe {

    public PriceCutBoyShoe(String name1, String type1, int value1) {
        super(name1, type1, value1);
    }

    public int getValue(){
        int primeCost = super.getValue();
        int cutPrice = 0;
        if(primeCost > 200){
            cutPrice = primeCost*80/100;
        }else if(primeCost>150){
            cutPrice = primeCost*85/100;
        }else{
            cutPrice = primeCost*90/100;
        }
        return cutPrice;
    }
}
