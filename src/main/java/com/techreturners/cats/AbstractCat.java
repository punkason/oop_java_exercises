package com.techreturners.cats;

public abstract class AbstractCat implements Cat{
    protected boolean sleep;
    protected String setting;
    protected int height;
    protected String eat;
    protected String run;

    public AbstractCat(String setting, int height, String eat, String run){
        sleep = false;
        this.setting = setting;
        this.height = height;
        this.eat = eat;
        this.run = run;
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
        return setting;
    }

    @Override
    public int getAverageHeight() {
        return height;
    }

    @Override
    public String eat()  {
        return eat;
    }

    @Override
    public String run() {
        return run;
    }
}
