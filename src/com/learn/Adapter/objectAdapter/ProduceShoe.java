package com.learn.Adapter.objectAdapter;

import com.learn.Adapter.classAdapter.ProduceCompany;
import com.learn.Adapter.classAdapter.ProduceDress;

//Adapter 适配器  对象适配器与类适配器的区别，只是本处用结合的方式引用ProduceDress
public class ProduceShoe  implements ProduceCompany {
    ProduceDress produceDress;
    ProduceShoe(ProduceDress produceDress){
        this.produceDress=produceDress;
    }
    @Override
    public String getShoe() {
        System.out.println("--鞋--");
        return "鞋子";
    }

    @Override
    public String getDress() {
        System.out.println("--衣服--");
        return "衣服";
    }
}
