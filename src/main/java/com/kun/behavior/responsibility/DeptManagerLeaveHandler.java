package com.kun.behavior.responsibility;

/**
 * 部门领导 审批
 */
public class DeptManagerLeaveHandler extends AbstractLeaveHandler {

    @Override
    public void handlerRequest(LeaveRequest request) {
        if(request.getDays() > this.MIN && request.getDays() <= this.MIDDLE){
            System.out.println("总监直接审批！ 已经处理;流程结束。");
            return;
        }
        System.out.println("总监做不了主 ， 下一个流程。");

        if(null != this.nextHandler){
            this.nextHandler.handlerRequest(request);
        }else{
            System.out.println("审批拒绝！");
        }
    }

}
