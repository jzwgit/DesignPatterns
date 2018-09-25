package com.learn.Interpreter;

import org.junit.Test;

public class TestMethod {
    @Test
    public void test1(){
        Context context = new Context();
        VariableDesc vd1 = new VariableDesc("X");
        VariableDesc vd2 = new VariableDesc("Y");
        VariableDesc vdTure = new VariableDesc("true");
        VariableDesc vdFalse = new VariableDesc("false");
        context.Opinion("true",true);
        context.Opinion("false",false);
        context.Opinion("X",false);
        context.Opinion("Y",true);

        // -- and表达式 --
        JudgmentDesc description1 = new AndDesc(new AndDesc(vdTure,vd2),new AndDesc(vd2,new NoDesc(vd1)));
        boolean outcome1 = description1.Opinion(context);
        System.out.println("结果 ：and 的逻辑为 "+outcome1);

        // -- or 表达式 --
        JudgmentDesc description2 = new OrDesc(new OrDesc(vdTure,vd1),new OrDesc(vd2,new NoDesc(vd1)));
        boolean outcome2 = description2.Opinion(context);
        System.out.println("结果 ：or 的逻辑为 "+outcome2);

    }

}
