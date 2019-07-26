package com.qf.weektest.service.Impl;

import com.qf.weektest.dao.RepairFormDao;
import com.qf.weektest.entity.RepairForm;
import com.qf.weektest.service.RepairFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Scope("prototype")
public class RepairFormServiceImpl implements RepairFormService {
    @Autowired
    private RepairFormDao dao;

    @Override
    public List<RepairForm> getAllErrorAppliance() {
        return dao.getAllErrorAppliance();
    }
}
