package com.techreturners.cats;

public abstract class WildCat implements Cat{
    protected boolean sleep;

    public WildCat(){
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
        return "wild";
    }

    @Override
    public abstract int getAverageHeight();

    @Override
    public abstract String eat();

    @Override
    public String run() {
        return "Running";
    }
}
