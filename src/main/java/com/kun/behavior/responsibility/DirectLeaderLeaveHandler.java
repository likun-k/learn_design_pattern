package com.kun.behavior.responsibility;

/**
 * 直接领导 审批
 */
public class DirectLeaderLeaveHandler extends AbstractLeaveHandler {

    @Override
    public void handlerRequest(LeaveRequest request) {
        if(request.getDays() <= this.MIN){
            System.out.println("经理可以直接审批！ 已经处理;流程结束。");
            return;
        }
        System.out.println("经理做不了主 ， 下一个流程");
        if(null != this.nextHandler){
            this.nextHandler.handlerRequest(request);
        }else{
            System.out.println("审批拒绝！");
        }
    }

}
