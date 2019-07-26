package com.qf.weektest.entity;

import java.util.List;

public class RepairForm {
    private String errorApplianceName;
    private String repairMan;
    private int uploadFlag;
    private int finishFlag;

    public RepairForm() {
    }

    public RepairForm(String errorApplianceName, String repairMan, int uploadFlag, int finishFlag) {
        this.errorApplianceName = errorApplianceName;
        this.repairMan = repairMan;
        this.uploadFlag = uploadFlag;
        this.finishFlag = finishFlag;
    }

    public String getErrorApplianceName() {
        return errorApplianceName;
    }

    public void setErrorApplianceName(String errorApplianceName) {
        this.errorApplianceName = errorApplianceName;
    }

    public String getRepairMan() {
        return repairMan;
    }

    public void setRepairMan(String repairMan) {
        this.repairMan = repairMan;
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
}
