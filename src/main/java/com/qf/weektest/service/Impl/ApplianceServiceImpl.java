package com.qf.weektest.service.Impl;

import com.qf.weektest.dao.ApplianceDao;
import com.qf.weektest.entity.Appliance;
import com.qf.weektest.service.ApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;


@Controller
@Service
public class ApplianceServiceImpl implements ApplianceService {

    @Autowired
    private ApplianceDao applianceDao;


    /**
     * AJAX校验电电器是否已存在
     * @param applianceName
     * @return
     */

    @Override
    public List<Appliance> checkinsert(String applianceName) {

        return applianceDao.checkinsert( applianceName );
    }


    /**
     * 添加电器
     * 调用dao层的增加insertAppliance方法
     * @param appliance
     * @return
     */
    @Override
    public int insertAppliance(Appliance appliance) {

        return applianceDao.insertAppliance( appliance );
    }



    /**删除单个
     * 调用dao层deleteApplianceById方法
     * @param applianceId
     * @return
     */
    @Override
    public int deleteApplianceById(long applianceId) {

        return applianceDao.deleteApplianceById( applianceId );
    }

    /**展示全部
     * 查询所有的电器,返回一个集合前端
     * @return
     */
    @Override
    public List<Appliance> showAllAppliance() {

        return applianceDao.showAllAppliance();
    }


}
