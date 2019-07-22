package com.qf.weektest.controller;

import com.qf.weektest.entity.RepairForm;
import com.qf.weektest.service.RepairFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Appliance")
public class RepairFormController {
    @Autowired
    private RepairFormService rservice;

    @RequestMapping(value = "/errormessage",method = RequestMethod.POST)
    public int insert(RepairForm repairForm){

        return 0;
    }
}
