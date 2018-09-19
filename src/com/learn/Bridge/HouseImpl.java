package com.learn.Bridge;

/**
 * Implementor(HouseImpl):定义实现类的接口，改接口不一定要与Abstraction的接口完全一致，
 * 事实上这两个接口可以完全不同。一般来讲Implementor接口仅提供基本操作，
 * 而Abstraction则定义了这些基本操作的较高层次的操作
 */
public interface HouseImpl {
    public String doShow(String strHouse);
}
