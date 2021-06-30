package com.company;

import java.util.Random;
import java.util.UUID;

public class Meter {
    private UUID id;
    private int index;
    private MeterType meterType;
    private int cosumption;

    public Meter(int index, MeterType meterType) {
        this.id = UUID.randomUUID();
        this.index = index;
        this.meterType = meterType;
    }

    public int getCosumption() {
        return cosumption;
    }

    public void monthlyUpdate() {
        Random random = new Random();
        int randomNumber = random.nextInt(5) + 1;

        this.cosumption = randomNumber*30;

        this.index += this.cosumption;
    }

    public MeterType getMeterType() {
        return meterType;
    }

    public boolean isLeaking(){
        if(meterType.equals(MeterType.TYPEONE)) {
            return cosumption > 25;
        }
        return false;
    }
}
