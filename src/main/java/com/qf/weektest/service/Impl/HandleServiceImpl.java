package com.qf.weektest.service.Impl;

import com.qf.weektest.dao.HandleDao;
import com.qf.weektest.entity.Appliance;
import com.qf.weektest.service.HandleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HandleServiceImpl implements HandleService {
    @Autowired
    private HandleDao handleDao;
    @Override
    public String selectFlag(Long id) {
        String msg = "";
        Appliance appliance = handleDao.selectFlag(id);
        if (appliance.getFlag() == 1) {
            msg = "开启中";
        }
        if (appliance.getFlag() == 0){
            msg = "关闭";
        }
        return msg;
    }

    @Override
    public String selectErrorFlag(Long id) {
        String msg = "";
        Appliance appliance = handleDao.selectErrorFlag(id);
        if (appliance.getErrorFlag() == 1) {
            msg = "正常运行中";
        }
        if (appliance.getFlag() == 0){
            msg = "异常！";
        }
        return msg;
    }

    @Override
    public String updateFlagNO(String applianceName) {
        handleDao.updateFlagNO(applianceName);
        return "forward:/Handle/handle";
    }

    @Override
    public String updateFlagOFF(String applianceName) {
       handleDao.updateFlagOFF(applianceName);
        return "forward:/Handle/handle";
    }

    @Override
    public Appliance selectOne(Long id) {
        Appliance appliance = handleDao.selectOne(id);
        return appliance;
    }

    @Override
    public String updateApplianceName(Appliance appliance) {
        handleDao.updateApplianceName(appliance);
        return "forward:/Handle/handle";
    }


}
