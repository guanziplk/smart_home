package com.qf.weektest.controller;

import com.qf.weektest.entity.Appliance;
import com.qf.weektest.service.ApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@RequestMapping(value = "/Appliance")
@Controller
public class ApplianceController {

    @Autowired
    private ApplianceService applianceService;

    /**
     * 登录页面
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET )
    public String login(){
        return "/login.html";
    }

    /**
     * 添加商品页面
     * @return
     */
    @RequestMapping(value = "/AddPage",method = RequestMethod.GET)
    public String AddPage(){
        return "add";
    }
    /**
     * 删除页面
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(){
        return "delete";
    }

    //==========================================方法区======================================

    /**
     * 添加电器到管理列表
     * AJAX验证数据库是否存在电器
     * @param applianceName
     * @return
     */
    @RequestMapping(value = "/checkinsert")
    @ResponseBody
    public int checkinsert(String applianceName){
        List<Appliance> applianceList = applianceService.checkinsert( applianceName );
        if(applianceList.size()!=0) {
            //数据库存在该数据 提示不能重复添加
            return 1;
        }else{
            return 0;
        }
    }


    /**
     * 添加电器到电器管理列表
     * @param appliance
     * @return
     */
    @RequestMapping(value = "/insertAppliance")
    public ModelAndView insertAppliance(Appliance appliance){
        //调用service方法
        int i = applianceService.insertAppliance(appliance);
        if(i!=0){
            //添加完电器后 在展示一次全部电器
            List<Appliance> applianceList = applianceService.showAllAppliance();
            ModelAndView mv = new ModelAndView();
            mv.setViewName("showAll");
            mv.addObject(applianceList);
            //重定向到全部电器页面
            return mv;
        }else{
            return null;
        }
    }



    /**
     * 把对应的电器移出电器管理列表
     * 根据applianceId进行移除
     * @param
     * @return
     */
    @RequestMapping(value = "/deleteApplianceById")
    public String deleteApplianceById(long applianceId){
        //调用service方法
        int i = applianceService.deleteApplianceById( applianceId );
        if(i!=0){
            //添加成功
            //重定向到展示全部页面 展示此时的数据
            return "redirect:/Appliance/select";
        }else{
            return "showAll";
        }
    }

    /**
     * 展示所有的电器
     * @param model
     * @return
     */
    @RequestMapping(value = "/select")
    public String select(Model model){
        List<Appliance> applianceList = applianceService.showAllAppliance();
        //返回一个集合list给前端
        model.addAttribute("applianceList" ,applianceList);
        System.out.println(applianceList);
        return "showAll";
    }
}
