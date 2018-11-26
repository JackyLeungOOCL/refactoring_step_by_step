package com.tws.refactoring;

public class Police {
    private int adultAge = 18;
    public boolean checkDriver(Driver driver) {
        if(driver.getAge() >= adultAge) return true;
        else return false;
    }
}
