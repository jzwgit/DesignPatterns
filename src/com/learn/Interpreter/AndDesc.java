package com.learn.Interpreter;

/**
 * 属于NonterminalExpression 非终结符表达式
 */
public class AndDesc implements JudgmentDesc{
    private JudgmentDesc property1;//属性1
    private JudgmentDesc property2;//属性2
    public AndDesc(JudgmentDesc desc1,JudgmentDesc desc2){
        property1 = desc1;
        property2 = desc2;
    }

    //意见
    @Override
    public boolean Opinion(Context context) {
        return property1.Opinion(context)&&property2.Opinion(context);
    }

    //交换
    @Override
    public JudgmentDesc Swap(String value, JudgmentDesc desc) {
        return new AndDesc(property1.Swap(value,desc),property2.Swap(value,desc));
    }
}
