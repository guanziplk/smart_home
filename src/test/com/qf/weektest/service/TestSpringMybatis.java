package com.qf.weektest.service;

import com.qf.weektest.dao.RepairFormDao;
import com.qf.weektest.entity.RepairForm;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

import java.util.List;

public class TestSpringMybatis {
    private static Logger logger = Logger.getLogger(TestSpringMybatis.class);

    public static void main(String[] args) {
        testSpringMybatis();
    }

    private static void testSpringMybatis(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context-mybatis.xml");
        SqlSessionFactory factory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession session = factory.openSession(true);
        try{
            RepairFormDao repairFormDao = session.getMapper(RepairFormDao.class);
            List<RepairForm> repairForms = repairFormDao.getAllErrorAppliance();
            System.out.println(repairForms);
            repairForms.forEach(repairForm-> logger.info(repairForm.getErrorApplianceName()+","+repairForm.getRepairMan()+","+repairForm.getUploadFlag()+","+repairForm.getFinishFlag()));
        }finally {
            session.close();
        }

    }
}
