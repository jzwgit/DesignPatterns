package com.learn.Interpreter;

/**
 * TerminalExpression(终结符表达式)
 */
public class VariableDesc implements JudgmentDesc{
    private String value;
    public VariableDesc(String _value){
        value = _value;
    }
    @Override
    public boolean Opinion(Context context) {
        return context.Search(value);
    }

    public JudgmentDesc Copu(){
        return new VariableDesc(value);
    }
    @Override
    public JudgmentDesc Swap(String operor, JudgmentDesc desc) {
        if(operor.equals(value)){
            return new VariableDesc(value);
        }
        return desc;
    }
}
