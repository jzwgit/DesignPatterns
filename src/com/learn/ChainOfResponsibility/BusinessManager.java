package com.learn.ChainOfResponsibility;

/**
 * 业务经理
 * 具体处理者（ConcreteHandler）角色：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家
 * 由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。
 */
public class BusinessManager extends Approval {

    @Override
    public String handleMenuRequest(String person, int menuId) {
        String str = "";
        //业务经理审批 >=50 编号的菜单
        if(menuId >= 50){
            //只允许程序猿
            if("程序猿".equals(person)){
                str = "允许：业务经理授予（"+person+")查看菜单内容，菜单编号为："+menuId;
            }else{
                //不允许其他人
                str = "不允许：业务经理不授予（"+person+")查看菜单内容，菜单编号为："+menuId;
            }
        }else{
            //如果有猴急处理对象，继续传递
            if(getPass() != null){
                return getPass().handleMenuRequest(person,menuId);
            }
        }
        return str;
    }
}
