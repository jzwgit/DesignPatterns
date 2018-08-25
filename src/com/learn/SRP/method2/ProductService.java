package com.learn.SRP.method2;

public class ProductService implements IProductService {
    @Override
    public String selectAll(String all) {
        String all1 = "全部查询";
        System.out.println(all1+"查询");
        return all1;
    }
}
