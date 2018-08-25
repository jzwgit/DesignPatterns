package com.learn.SRP.method1;

public class ProductEntity implements IProductEntity {
    @Override
    public String getYearMonth(String YearMonth) {
        String YearMonth1 = "报表日期";
        System.out.println(YearMonth+"年月");
        return YearMonth1;
    }

    @Override
    public String getName(String Name) {
        String Name1 = "手机";
        System.out.println(Name+"功能性");
        return Name1;
    }

    @Override
    public String getType(String type) {
        String type1 = "产品类型";
        System.out.println(type+"产品类型");
        return type1;
    }

    @Override
    public String getBrand(String Brand) {
        String Brand1 = "品牌";
        System.out.println(Brand+"眼镜");
        return Brand1;
    }

    @Override
    public int getValue(int Value) {
        int Value1 = 20;
        System.out.println(Value+"价格");
        return Value1;
    }

    @Override
    public String getLocality(String Locality) {
        String Locality1 = "产地";
        System.out.println(Locality+"产品产地");
        return Locality1;
    }

    @Override
    public String selectAll(String all)  {
        String all1 = "全部查询";
        System.out.println(all+"查询");
        return all1;
    }
}
