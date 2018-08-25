package com.learn.OCP.pojo;

public class PriceCutGirlShoe extends GirlShoe {

    public PriceCutGirlShoe(String name2, String type2, int value2) {
        super(name2, type2, value2);
    }
    public int getValue(){
        int primeCost = super.getValue();
        int cutPrice = 0;
        if(primeCost > 200){
            cutPrice = primeCost*75/100;
        }else if(primeCost>150){
            cutPrice = primeCost*80/100;
        }else{
            cutPrice = primeCost*85/100;
        }
        return cutPrice;
    }
}
