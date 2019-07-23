package com.qf.weektest.service;


import com.qf.weektest.entity.RepairForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context-mybatis.xml"
        , "classpath:spring-context-druid.xml"
        , "classpath:spring-context.xml"})

public class ApplianceServiceTest {

    @Autowired
    public RepairFormService repairFormService;


    @Test
    public void testinsert(){

        //模拟测试 赋值
        RepairForm repairForm = new RepairForm();

        repairForm.setErrorApplianceName("phone");

        repairForm.setRepairMan("zs");

        int insert = repairFormService.insert(repairForm);

        System.out.println(insert);

    }

    @Test
    public void testdelete(){

        RepairForm repairForm = new RepairForm();

        //模拟前端用户传入删除的值
        repairForm.setErrorApplianceName("act");

        int i = repairFormService.delete( repairForm.getErrorApplianceName());

        System.out.println(i);

    }

}
