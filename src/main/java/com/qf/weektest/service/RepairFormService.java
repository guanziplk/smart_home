package com.qf.weektest.service;

import com.qf.weektest.entity.RepairForm;

import java.util.List;

public interface RepairFormService {
    int insert(RepairForm repairForm);
    int delete(String errorApplianceName);
    List<RepairForm> getAllErrorAppliance();
}
