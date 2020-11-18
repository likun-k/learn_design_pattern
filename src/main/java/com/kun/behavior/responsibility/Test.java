package com.kun.behavior.responsibility;

public class Test {


    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest();
        leaveRequest.setDays(7);
        leaveRequest.setName("苦逼的程序员");
        leaveRequest.setRemark("割痔疮2333");

        AbstractLeaveHandler directLeader = new DirectLeaderLeaveHandler();
        directLeader.setHandlerName("项目经理");

        AbstractLeaveHandler deptManager = new DeptManagerLeaveHandler();
        deptManager.setHandlerName("总监");

        AbstractLeaveHandler boss = new BossLeaveHandler();
        boss.setHandlerName("老板");

        //设置链式处理   经理做不了主的 给总监，总监做不了主的给老板
        directLeader.setNextHandler(deptManager);
        deptManager.setNextHandler(boss);

        // 程序员请假 先找经理审批
        directLeader.handlerRequest(leaveRequest);
    }



}
