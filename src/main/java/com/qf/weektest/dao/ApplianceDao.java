package com.qf.weektest.dao;
import com.qf.weektest.entity.Appliance;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;

@Controller
@Repository
public interface ApplianceDao {

    /**
     * 添加电器到管理页面
     * @param appliance
     * @return
     */
    int insertAppliance(Appliance appliance);


    /**
     *根据电器的id删除电器
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
