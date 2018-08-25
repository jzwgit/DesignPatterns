package com.learn.SRP.method1;

public class ProductService implements IProductEntity {
    @Override
    public String getYearMonth(String YearMonth) {
        return null;
    }

    @Override
    public String getName(String Name) {
        return null;
    }

    @Override
    public String getType(String type) {
        return null;
    }

    @Override
    public String getBrand(String Brand) {
        return null;
    }

    @Override
    public int getValue(int Value1) {
        return 0;
    }

    @Override
    public String getLocality(String Locality) {
        return null;
    }

    @Override
    public String selectAll(String all) {
        String all1 = "全部查询";
        System.out.println(all + "查询");
        return all1;
    }
}
