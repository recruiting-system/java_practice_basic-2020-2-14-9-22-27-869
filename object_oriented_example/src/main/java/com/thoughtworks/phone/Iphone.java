package com.thoughtworks.phone;

import static com.thoughtworks.phone.IphoneChargingInterface.LIGHTNING;

public class Iphone extends Phone {
    /**
     * 默认不带无线充电功能构造函数，可以减少new时的参数传入
     *
     */
    public Iphone() {
        this(false);
    }

    public Iphone(boolean chargeWirelessly) {
        super(LIGHTNING, chargeWirelessly);
    }
}
