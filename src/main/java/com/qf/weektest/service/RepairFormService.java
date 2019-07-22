package com.qf.weektest.service;

import com.qf.weektest.entity.RepairForm;

public interface RepairFormService {
    int insert(RepairForm repairForm);
    int delete(String errorApplianceName);
}
