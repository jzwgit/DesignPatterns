package com.learn.ChainOfResponsibility;

/**
 * 配置管理者（处理者实现类）
 * 具体处理者（ConcreteHandler)角色；具体处理者接受到请求后，可以选择将请求处理掉，或者将请求传给下家。
 * 由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。
 */
public class Cm extends Approval {
    @Override
    public String handleMenuRequest(String person, int menuId) {
        String str = "";
        //配置管理员允许查看30以内的菜单
        if(menuId<30){
            //只允许程序猿
            if("程序猿".equals(person)){
                str="允许：管理员授予（"+person+")查看菜单内容，菜单编号为："+menuId;
            }else{
                //不允许其他人
                str="不允许：管理员不授予（"+person+")查看菜单内容，菜单编号为："+menuId;
            }
        }else{
            //超过30，传给上一级处理
            return getPass().handleMenuRequest(person,menuId);
        }
        return str;
    }
}
