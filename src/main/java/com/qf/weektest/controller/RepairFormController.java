package com.qf.weektest.controller;

import com.qf.weektest.entity.RepairForm;
import com.qf.weektest.service.RepairFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/Appliance")
public class RepairFormController {
    @Autowired
    private RepairFormService rservice;
/*
    @RequestMapping(value = "/toError")
    public String toError(){
        return "error";
    }*/

    @RequestMapping(value = "/error",method = RequestMethod.GET)
    public String getAllErrorAppliance(Model model){
        List<RepairForm> repairForms = rservice.getAllErrorAppliance();
        model.addAttribute("repairForm",repairForms);
        return "error";
    }
}
