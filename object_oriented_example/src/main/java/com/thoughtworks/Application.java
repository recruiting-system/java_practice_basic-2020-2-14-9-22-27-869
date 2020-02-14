package com.thoughtworks;

import com.thoughtworks.charger.Charger;
import com.thoughtworks.charger.WiredCharger;
import com.thoughtworks.charger.WirelessCharger;
import com.thoughtworks.flapper.Flapper;
import com.thoughtworks.phone.AndroidPhone;
import com.thoughtworks.phone.Iphone;
import com.thoughtworks.phone.Phone;

import static com.thoughtworks.phone.AndroidChargingInterface.TYPE_C;
import static com.thoughtworks.phone.IphoneChargingInterface.LIGHTNING;

public class Application {

    public static void main(String[] args) {
        Flapper flapper = new Flapper();

        // 给Type-c安卓手机有线充电
        Phone typeCPhone = new AndroidPhone(TYPE_C);
        Charger typeCCharger = new WiredCharger(TYPE_C);
        charge(typeCPhone, typeCCharger, flapper);

        // 给支持无线充电的Type-c安卓手机无线充电
        Phone typeCPhone1 = new AndroidPhone(TYPE_C, true);
        Charger wirelessCharger = new WirelessCharger();
        charge(typeCPhone1, wirelessCharger, flapper);

        // 尝试给不支持无线充电的手机用无线充电器充电
        charge(typeCPhone, wirelessCharger, flapper);

        // 给Iphone手机有线充电
        Iphone iphone = new Iphone();
        Charger lightningCharger = new WiredCharger(LIGHTNING);
        charge(iphone, lightningCharger, flapper);

        // 尝试用Iphone接口的充电器为安卓手机充电
        charge(typeCPhone1, lightningCharger, flapper);

        // 剩下的场景你可以随便玩~~~

    }

    /**
     * 利用多态来屏蔽子类实现的差异
     * 题意中没有说明充电这个动作的主题 所有我选择直接用一个方法，如果充电这个动作的主体是人
     * 我会再创建一个Person类 并把这个方法写到类中
     */
    public static void charge(Phone phone, Charger charger, Flapper flapper) {
        boolean connectCharge = phone.connectCharge(charger);
        if (connectCharge) {
            charger.connectFlapper(flapper);
        }
    }
}
