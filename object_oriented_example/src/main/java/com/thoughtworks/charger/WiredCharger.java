package com.thoughtworks.charger;

import com.thoughtworks.phone.ChargingInterface;
import com.thoughtworks.phone.Phone;

public class WiredCharger extends Charger {
    private final ChargingInterface chargingInterface;

    public WiredCharger(ChargingInterface chargingInterface) {
        this.chargingInterface = chargingInterface;
    }

    @Override
    public boolean connectPhone(Phone phone) {
        if (phone.getChargingInterface() == this.chargingInterface) {
            System.out.println("有线充电器连接手机成功:" + phone);
            return true;
        } else {
            System.out.println(String.format("连接失败,充电接口不匹配,充电器接口: %s 手机接口: %s",
                    chargingInterface,
                    phone.getChargingInterface()));
            return false;
        }
    }

}
