package com.techreturners.cats;

public class DomesticCat implements Cat {
    protected boolean sleep;

    public DomesticCat(){
        sleep = false;
    }

    @Override
    public void goToSleep() {
        sleep = true;
    }

    @Override
    public boolean isAsleep() {
        return sleep;
    }

    @Override
    public void wakeUp() {
        sleep = false;
    }

    @Override
    public String getSetting() {
        return "domestic";
    }

    @Override
    public int getAverageHeight() {
        return 23;
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }
}
