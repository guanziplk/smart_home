package com.qf.weektest.service;



import com.qf.weektest.entity.Appliance;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public interface ApplianceService {

    /**
     * 添加电器到电器管理页面
     * @param appliance
     * @return
     */
    int insertAppliance(Appliance appliance);


    /**
     * 根据电器的id的把商品移除出电器管理页面
     * @param applianceId
     * @return
     */
    int deleteApplianceById(long applianceId);


    /**
     * 查询并展示所有的电器
     * @return
     */
    List<Appliance> showAllAppliance();


    /**
     * AJAX校验电器是否已存在
     * @param applianceName
     * @return
     */
    List<Appliance> checkinsert(String applianceName);



}
