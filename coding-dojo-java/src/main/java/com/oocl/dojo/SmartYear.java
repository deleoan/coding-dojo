package com.oocl.dojo;

public class SmartYear {

    private int year;

    public SmartYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0))
            return true;
        return false;
    }
}
