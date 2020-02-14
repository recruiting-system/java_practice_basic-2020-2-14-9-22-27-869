package com.thoughtworks.phone;

public class AndroidPhone extends Phone {
    /**
     * 默认不带无线充电功能构造函数，可以减少new时的参数传入
     *
     */
    public AndroidPhone(AndroidChargingInterface chargingInterface) {
        this(chargingInterface, false);
    }

    public AndroidPhone(AndroidChargingInterface chargingInterface, boolean chargeWirelessly) {
        super(chargingInterface, chargeWirelessly);
    }
}
