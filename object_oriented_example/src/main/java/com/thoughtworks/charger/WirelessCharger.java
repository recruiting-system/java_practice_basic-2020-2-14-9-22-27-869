package com.thoughtworks.charger;

import com.thoughtworks.phone.Phone;

public class WirelessCharger extends Charger {
    @Override
    public boolean connectPhone(Phone phone) {
        if (phone.isChargeWirelessly()) {
            System.out.println("无线充电器连接手机成功: " + phone);
            return true;
        } else {
            System.out.println("连接失败,该手机不支持无线充电: " + phone);
            return false;
        }
    }
}
