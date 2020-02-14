package com.thoughtworks.charger;

import com.thoughtworks.flapper.Flapper;
import com.thoughtworks.phone.Phone;

public abstract class Charger {
    public abstract boolean connectPhone(Phone phone);

    public boolean connectFlapper(Flapper flapper) {
        return flapper.connectCharge(this);
    }
}
