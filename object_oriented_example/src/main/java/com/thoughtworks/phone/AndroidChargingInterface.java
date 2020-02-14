package com.thoughtworks.phone;

/**
 * 安卓手机充电接口类型
 *
 * 之所以把安卓手机充电接口和苹果手机充电接口分开
 * 是因为安卓手机在初始化的时候应该只能传入安卓手机的充电接口
 * 通过类型来实现隔离
 */
public enum AndroidChargingInterface implements ChargingInterface {
    TYPE_C,
    MINI_USB;
}
