package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WaterCompany {
    private List<Client> clientList;
    private List<Meter> meterList;
    private int waterRate;

    public WaterCompany(int waterRate) {
        this.clientList = new ArrayList<>();
        this.waterRate = waterRate;
    }

    public List<Meter> getAllLeaks() {

        List<Meter> typeOneMeters = meterList.stream().filter(meter -> meter.getMeterType().equals(MeterType.TYPEONE))
                .collect(Collectors.toList());

        return typeOneMeters.stream().filter(Meter::isLeaking).collect(Collectors.toList());

    }

    public List<Client> getTopThreeClients() {

        return clientList.stream().sorted(Comparator.comparing(Client::howMuchToPay)).limit(3).collect(Collectors.toList());

    }
}
