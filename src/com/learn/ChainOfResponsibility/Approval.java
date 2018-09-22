package com.learn.ChainOfResponsibility;

/**
 * approval 审批 抽象处理这（Handler)角色
 */
public abstract class Approval {
   //拥有处理请求的下一个对象
   protected Approval pass = null;

    //取值方法
    public Approval getPass(){
        return pass;
    }
    //为下一个处理请求的对象进行设置
    public void setPass(Approval pass){
        this.pass = pass;
    }

    /**
     * 处理菜单查看的申请
     * @param person    申请人
     * @param menuId    菜单编号
     * @return          允许活不允许的情况
     */
    public abstract String handleMenuRequest(String person,int menuId);
}
