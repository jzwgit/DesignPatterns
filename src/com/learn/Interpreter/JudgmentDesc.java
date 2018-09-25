package com.learn.Interpreter;

/**
 * 抽象表达式 - AbstractExpression
 * 评判
 */
public interface JudgmentDesc {
    //判断逻辑
    public abstract boolean Opinion(Context context);
    //交换
    public abstract JudgmentDesc Swap(String value,JudgmentDesc desc);

}
