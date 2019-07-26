package com.qf.weektest.service;

import com.qf.weektest.entity.Appliance;

public interface HandleService {
    /**
     * 查询flag的值,判断开关状态
     * @param id 根据id查询
     * @return flag用于判断
     */
    String selectFlag(Long id);

    /**
     * 查询flag的值,判断异常状态
     * @param id 根据id查询
     * @return errorFlag用于判断
     */
    String selectErrorFlag(Long id);

    /**
     * 家电开启控制器
     * @param applianceName 根据ID更改开关状态
     * @param
     * @return 受影响行数
     */
    String updateFlagNO(String applianceName);

    /**
     * 家电关闭控制器
     * @param applianceName 根据ID更改开关状态
     * @param
     * @return 受影响行数
     */
    String updateFlagOFF(String applianceName);

    /**
     * 查询单个家电详情
     * @param id 更加id查询
     * @return 返回存放查询信息的对象
     */
    Appliance selectOne(Long id);

    /**
     * 更改家电名字
     * @param appliance
     * @return
     */
    String updateApplianceName(Appliance appliance);
}
