package com.qf.weektest.entity;

import java.util.Date;

public class Appliance {
    private long applianceId;
    private String applianceName;
    private int flag;
    private Date startTime;
    private Date endTime;
    private Date runningTime;
    private Date totalRunningTime;
    private String applianceDes;

    public Appliance() {
    }

    public Appliance(long applianceId, String applianceName, int flag, Date startTime, Date endTime, Date runningTime, Date totalRunningTime, String applianceDes) {
        this.applianceId = applianceId;
        this.applianceName = applianceName;
        this.flag = flag;
        this.startTime = startTime;
        this.endTime = endTime;
        this.runningTime = runningTime;
        this.totalRunningTime = totalRunningTime;
        this.applianceDes = applianceDes;
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

    public Date getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Date runningTime) {
        this.runningTime = runningTime;
    }

    public Date getTotalRunningTime() {
        return totalRunningTime;
    }

    public void setTotalRunningTime(Date totalRunningTime) {
        this.totalRunningTime = totalRunningTime;
    }

    public String getApplianceDes() {
        return applianceDes;
    }

    public void setApplianceDes(String applianceDes) {
        this.applianceDes = applianceDes;
    }
}
