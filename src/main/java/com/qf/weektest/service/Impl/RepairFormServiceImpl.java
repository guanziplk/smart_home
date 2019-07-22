package com.qf.weektest.service.Impl;

import com.qf.weektest.dao.RepairFormDao;
import com.qf.weektest.entity.RepairForm;
import com.qf.weektest.service.RepairFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepairFormServiceImpl implements RepairFormService {
    @Autowired
    private RepairFormDao dao;

    @Override
    public int insert(RepairForm repairForm){
        return dao.insert(repairForm);
    }

    @Override
    public int delete(String errorApplianceName) {
        return dao.delete(errorApplianceName);
    }
}
