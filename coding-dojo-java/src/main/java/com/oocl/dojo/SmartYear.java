package com.oocl.dojo;

class SmartYear {

    private int year;

    SmartYear(int year) {
        this.year = year;
    }

    boolean isLeapYear() {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
