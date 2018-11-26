package com.tws.refactoring;

public class Police {
    private int adultAge = 18;

    public boolean checkDriverAdult(Driver driver) {
        return (isAdult(driver.getAge()));
    }

    public boolean isAdult(int age) {
        return (age >= adultAge);
    }
}
