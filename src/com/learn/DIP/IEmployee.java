package com.learn.DIP;

//管理层接口
public interface IEmployee {
    //管理人员让程序猿进行工作（写代码）
    public String code(ICode iCode);
}
