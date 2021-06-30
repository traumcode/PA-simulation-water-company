package com.company;

import java.util.List;

public class BussinessClient extends Client {
    public BussinessClient(String name, String address, String bankAccount, List<Location> locationList) {
        super(name, address, bankAccount, locationList, ClientType.BUSSINESSCLIENT);
    }

    @Override
    public double howMuchToPay() {
        double totalConsumption = 0;
        for (Location location : getLocationList()) {
            for (Meter meter : location.getMeterList()) {
                totalConsumption += meter.getCosumption();
            }
        }
        return totalConsumption/0.15;
    }
}
