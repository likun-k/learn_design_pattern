package com.kun.behavior.responsibility;

/**
 * 1. 员工请假 申请
 */
public class LeaveRequest {

    private String name; // 员工姓名
    private int days; //请假天数
    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
