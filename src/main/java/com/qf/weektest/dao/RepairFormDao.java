package com.qf.weektest.dao;

import com.qf.weektest.entity.RepairForm;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepairFormDao {
    int insert(RepairForm repairForm);
    int delete(String errorApplianceName);
    List<RepairForm> getAllErrorAppliance();
}
