package com.company;

import java.util.List;

public abstract class Client {
    private String name;
    private String address;
    private String bankAccount;
    private List<Location> locationList;
    private ClientType clientType;

    public Client(String name, String address, String bankAccount, List<Location> locationList, ClientType clientType) {
        this.name = name;
        this.address = address;
        this.bankAccount = bankAccount;
        this.locationList = locationList;
        this.clientType = clientType;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public abstract double howMuchToPay();
}
