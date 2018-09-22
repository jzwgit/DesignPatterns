package com.learn.Command;

/**
 * Invoker(调用者)类
 * 拥有功能键对应命令对象的豆浆机对象 invoker
 */
public class SoyMilkGrinder {
    //启动命令对象
    private Command startupCommand;

    /**
     * 设置启动机器命令对象
     * @param startupCommand 启动机器命令对象
     */
    public void setStartupCommand(Command startupCommand) {
        this.startupCommand = startupCommand;
    }

    //为客户提供，接收并响应用户请求的功能。也就是按下功能键，进行的方法
    public String startupFunction(){
        return startupCommand.execute();
    }
}
