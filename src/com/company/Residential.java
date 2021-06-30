package com.company;

import java.util.List;

public class Residential extends Client{
    public Residential(String name, String address, String bankAccount, List<Location> locationList) {
        super(name, address, bankAccount, locationList, ClientType.RESIDENTIAL);
    }

    @Override
    public double howMuchToPay() {
        double totalConsumption = 0;
        for (Location location : getLocationList()) {
            for (Meter meter : location.getMeterList()) {
                totalConsumption += meter.getCosumption();
            }
        }
        return totalConsumption;
    }
}
