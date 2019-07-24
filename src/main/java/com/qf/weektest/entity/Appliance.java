package com.qf.weektest.entity;

import java.util.Date;

public class Appliance {
    private long applianceId;//家电编号
    private String applianceName;//家电名字
    private int flag;//家电运行状态（默认1为运行中，0为停止）
    private Date startTime;//启动时间
    private Date endTime;//结束时间
    private String runningTime;//运行时间
    private String totalRunningTime;//总运行时间
    private String applianceDes;//家电描述
    private int errorFlag;//错误状态（默认1为正常，0为异常）

    public Appliance() {
    }

    public Appliance(long applianceId, String applianceName, int flag, Date startTime, Date endTime, String runningTime, String totalRunningTime, String applianceDes, int errorFlag) {
        this.applianceId = applianceId;
        this.applianceName = applianceName;
        this.flag = flag;
        this.startTime = startTime;
        this.endTime = endTime;
        this.runningTime = runningTime;
        this.totalRunningTime = totalRunningTime;
        this.applianceDes = applianceDes;
        this.errorFlag = errorFlag;
    }

    public long getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(long applianceId) {
        this.applianceId = applianceId;
    }

    public String getApplianceName() {
        return applianceName;
    }

    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getTotalRunningTime() {
        return totalRunningTime;
    }

    public void setTotalRunningTime(String totalRunningTime) {
        this.totalRunningTime = totalRunningTime;
    }

    public String getApplianceDes() {
        return applianceDes;
    }

    public void setApplianceDes(String applianceDes) {
        this.applianceDes = applianceDes;
    }

    public int getErrorFlag() {
        return errorFlag;
    }

    public void setErrorFlag(int errorFlag) {
        this.errorFlag = errorFlag;
    }
}
