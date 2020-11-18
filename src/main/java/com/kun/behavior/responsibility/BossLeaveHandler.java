package com.kun.behavior.responsibility;

/**
 * 老板 审批
 */
public class BossLeaveHandler extends AbstractLeaveHandler {

    @Override
    public void handlerRequest(LeaveRequest request) {
        if(request.getDays() > this.MIDDLE && request.getDays() <= this.MAX){
            System.out.println("老板已经处理;流程结束。");
            return;
        }

        if(null != this.nextHandler){
            this.nextHandler.handlerRequest(request);
        }else{
            System.out.println("审批拒绝！");
        }
    }

}
