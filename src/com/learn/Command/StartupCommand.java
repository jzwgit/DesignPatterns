package com.learn.Command;

/**
 * 命令实现类
 * 具有启动机器命令的实现类，实现Command接口，通过调用接收者的方法来实现命令
 */
public class StartupCommand implements Command {
    //真实实现命令的接收者-电路对象
    private Icircuit icircuit = null;

    public StartupCommand(Icircuit icircuit){
        this.icircuit = icircuit;
    }

    @Override
    public String execute() {
        return this.icircuit.startup();
    }
}
