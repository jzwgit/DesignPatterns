package com.learn.ChainOfResponsibility;

/**
 * 组长（处理者实现类）
 * 具体处理者（ConcreteHandler)角色：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。
 * 由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。
 */
public class TeamLeader extends Approval {
    @Override
    public String handleMenuRequest(String person, int menuId) {
        String str = "";
        //组长只审批50以内的菜单查看权
        if(menuId<50){
            //允许程序猿
            if("程序猿".equals(person)){
                str = "允许：组长授予（"+person+")查看菜单内容，菜单编号为："+menuId;
            }else{
                //不允许他人
                str = "不允许：组长不授予（"+person+")查看菜单内容，菜单编号为："+menuId;
            }
        }else{
            //超过50,继续传递给更高层解决
            if(getPass() != null){
                return getPass().handleMenuRequest(person,menuId);
            }
        }
        return str;
    }
}
