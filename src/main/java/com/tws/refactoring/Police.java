package com.tws.refactoring;

public class Police {
    private int adultAge = 18;
    public boolean checkDriver(Driver driver) {
        return (driver.getAge() >= adultAge);
    }
}
