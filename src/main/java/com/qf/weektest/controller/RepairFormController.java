package com.qf.weektest.controller;

import com.qf.weektest.entity.RepairForm;
import com.qf.weektest.service.ApplianceService;
import com.qf.weektest.service.RepairFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
@SuppressWarnings("ALL")
@Controller
@RequestMapping("/Appliance")
public class RepairFormController {
    @Autowired
    private RepairFormService rservice;

    @Autowired
    private ApplianceService aservice;

    @RequestMapping(value = "/error",method = RequestMethod.GET)
    public String getAllAppliance(Model model){
        List<RepairForm> repairForms = rservice.getAllErrorAppliance();
        model.addAttribute("repairForm",repairForms);
        return "error";
    }
}
