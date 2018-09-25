package com.learn.Interpreter;

/**
 * 属于NoterminalExpression 非终结符表达式
 */
public class NoDesc implements JudgmentDesc{
    private JudgmentDesc noDesc;
    public NoDesc(JudgmentDesc judgmentDesc){
        noDesc = judgmentDesc;
    }
    //判断逻辑
    @Override
    public boolean Opinion(Context context) {
        return !(noDesc.Opinion(context));
    }

    //替换逻辑
    @Override
    public JudgmentDesc Swap(String operor, JudgmentDesc desc) {
        return new NoDesc(noDesc.Swap(operor,desc));
    }
}
