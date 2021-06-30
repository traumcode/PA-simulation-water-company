package com.company;

import java.util.List;

public class Location {
    private List<Meter> meterList;

    public Location(List<Meter> meterList) {
        if(meterList.size() == 0){
            throw new IllegalArgumentException("There must be at least one meter.");
        }

        this.meterList = meterList;
    }

    public List<Meter> getMeterList() {
        return meterList;
    }
}
