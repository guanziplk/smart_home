package com.qf.weektest.controller;

import com.qf.weektest.entity.Appliance;
import com.qf.weektest.service.HandleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Handle")

public class HandleController {

    @Autowired
    private HandleService handleService;

    /*登录单个家电展示*/
    @RequestMapping(value = "/tohandle")
    public String register() {
        return "handle";
    }

    /*1.查询单个电器信息*/
    @RequestMapping(value = "/selectOne")
    public String selectOne(Appliance appliance, Model model) {
        Appliance appliance1 = handleService.selectOne(appliance.getApplianceId());
        List<Appliance> list = new ArrayList<>();
        model.addAttribute("appliance1",appliance1);
        list.add(appliance1);
        model.addAttribute("list",list);
        return "detail";
    }

    /*2.点击开启/关闭,客户端传进来flag=1/flag=0,传进数据库,进行对应电器的flag更改,再查询一次*/
    @ResponseBody
    @RequestMapping(value = "/updateFlagNo")
    public int updateFlagNO(Appliance appliance) {
        String url = handleService.updateFlagNO(appliance.getApplianceName());
        return 1;
    }
    @ResponseBody
    @RequestMapping(value = "/updateFlagOFF")
    public int updateFlagOFF(Appliance appliance) {
        String url = handleService.updateFlagOFF(appliance.getApplianceName());
        return 0;
    }


    /*3.更改电器昵称功能*/
    @RequestMapping(value = "/updatename")
    public String updateName(Appliance appliance,Model model) {
        List<Appliance> list = new ArrayList<>();
        list.add(appliance);
        model.addAttribute("list",list);
        return "updatename";
    }
    @RequestMapping(value = "/updateApplianceName")
    public String updateApplianceName(Appliance appliance) {
        String url = handleService.updateApplianceName(appliance);
        return "/Handle/showAll";
    }

    /*测试*/
    @RequestMapping("/showAll")
    public String TestOne() {
        return "showAll";
    }





    /*1.查询电器flag的值("1"为开返回客户端开的信息,"0"为关闭返回客户端关闭信息)*/
    /*  @RequestMapping(value = "/handle",method = RequestMethod.POST)
    public String selectFlag(Appliance appliance, ModelMap modelMap) {
        String AMsg = handleService.selectFlag(appliance.getApplianceId());
        modelMap.addAttribute("AMsg", AMsg);
        return "handle";
    }*/

}
