package com.qf.weektest.entity;

import java.util.Date;

public class Appliance {


    private long applianceId;
    private String applianceName;
    private int flag;
    private Date startTime;
    private Date endTime;
    private String runningTime;
    private String totalRunningTime;
    private String applianceDes;
    private int errorFlag;
    private int uploadFlag;
    private int finishFlag;
    private String repairMan;

    public Appliance() {
    }

    public Appliance(long applianceId, String applianceName, int flag, Date startTime, Date endTime, String runningTime, String totalRunningTime, String applianceDes, int errorFlag, int uploadFlag, int finishFlag, String repairMan) {
        this.applianceId = applianceId;
        this.applianceName = applianceName;
        this.flag = flag;
        this.startTime = startTime;
        this.endTime = endTime;
        this.runningTime = runningTime;
        this.totalRunningTime = totalRunningTime;
        this.applianceDes = applianceDes;
        this.errorFlag = errorFlag;
        this.uploadFlag = uploadFlag;
        this.finishFlag = finishFlag;
        this.repairMan = repairMan;
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

    public int getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(int uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public int getFinishFlag() {
        return finishFlag;
    }

    public void setFinishFlag(int finishFlag) {
        this.finishFlag = finishFlag;
    }

    public String getRepairMan() {
        return repairMan;
    }

    public void setRepairMan(String repairMan) {
        this.repairMan = repairMan;
    }
}
