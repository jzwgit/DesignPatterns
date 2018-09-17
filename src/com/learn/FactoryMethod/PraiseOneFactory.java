package com.learn.FactoryMethod;

// 机械厂表扬 1（具体工厂）
public class PraiseOneFactory implements IMachineFactory {

    @Override
    public IXiaoMing CreateXiaoMing() {
        return new PriaseOne();
    }
}
