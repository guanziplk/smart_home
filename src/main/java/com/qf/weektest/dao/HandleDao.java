package com.qf.weektest.dao;

import com.qf.weektest.entity.Appliance;
import org.springframework.stereotype.Repository;

@Repository
public interface HandleDao {
    /**
     * 查询开关flag的值
     * @param id
     * @return
     */
    Appliance selectFlag(Long id);

    /**
     * 查询开关errorFlag的值
     * @param id
     * @return
     */
    Appliance selectErrorFlag(Long id);
    /**
     * 家电开启控制器
     * @param applianceName 根据ID更改开关状态
     * @param
     */
    void updateFlagNO(String applianceName);

    /**
     * 家电关闭控制器
     * @param applianceName 根据ID更改开关状态
     * @param
     */
    void updateFlagOFF(String applianceName);

    /**
     * 查询单个家电详情
     * @param id 更加id查询
     * @return 返回存放查询信息的对象
     */
    Appliance selectOne(Long id);

    /**
     * 更改名字
     * @param appliance
     */
    void updateApplianceName(Appliance appliance);
}
