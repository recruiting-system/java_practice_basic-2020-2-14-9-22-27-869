package com.thoughtworks.phone;

import com.thoughtworks.charger.Charger;

public abstract class Phone {

    private final ChargingInterface chargingInterface;
    private final boolean chargeWirelessly;


    /**
     * 要完成充电 两个属性我认为都是必要的 所以我构造方法只提供全餐构造方法
     */
    public Phone(ChargingInterface chargingInterface, boolean chargeWirelessly) {
        this.chargingInterface = chargingInterface;
        this.chargeWirelessly = chargeWirelessly;
    }

    /**
     * 因为手机连接充电器 和 充电器连接手机其实是同样的效果
     * 这里委托充电器的连接方法来实现手机与充电器的连接
     * 这样可以利用多态屏蔽充电器的实现细节
     */
    public boolean connectCharge(Charger charger) {
        return charger.connectPhone(this);
    }

    public ChargingInterface getChargingInterface() {
        return chargingInterface;
    }

    public boolean isChargeWirelessly() {
        return chargeWirelessly;
    }
}
