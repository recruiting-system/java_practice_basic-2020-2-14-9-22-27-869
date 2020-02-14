package com.thoughtworks.flapper;

import com.thoughtworks.charger.Charger;

import java.util.ArrayList;
import java.util.List;

public class Flapper {

    public static final int MAX_INTERFACE = 4;

    private final List<Charger> chargers = new ArrayList<>();

    public boolean connectCharge(Charger charger) {
        int remaining = MAX_INTERFACE - chargers.size();
        if (remaining > 0) {
            chargers.add(charger);
            System.out.println("已经连接充电器,目前剩余接口数:" + (remaining - 1));
            return true;
        } else {
            System.out.println("连接失败,接口已满");
            return false;
        }
    }

}
