package com.learn.FactoryMethod;

// 机械厂表扬 2 （具体工厂）
public class PraiseTwoFactory implements IMachineFactory {
    @Override
    public IXiaoMing CreateXiaoMing() {
        return new PriaseTwo();
    }
}
