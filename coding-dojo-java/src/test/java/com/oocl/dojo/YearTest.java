package com.oocl.dojo;

import org.junit.Assert;
import org.junit.Test;

public class YearTest {
    @Test
    public void the_year_2004_should_be_a_leap_year() throws Exception {
        SmartYear smartYear = new SmartYear(2004);
        boolean isLeapYear = smartYear.isLeapYear();

        Assert.assertTrue(isLeapYear);
    }

    @Test
    public void the_year_1996_should_be_a_leap_year() throws Exception {
        SmartYear smartYear = new SmartYear(1996);
        boolean isLeapYear = smartYear.isLeapYear();

        Assert.assertTrue(isLeapYear);
    }

    @Test
    public void the_year_2001_should_not_be_a_leap_year() throws Exception {
        SmartYear smartYear = new SmartYear(2001);
        boolean isLeapYear = smartYear.isLeapYear();

        Assert.assertTrue(isLeapYear);
    }

    @Test
    public void the_year_2000_should_be_a_leap_year() throws Exception {
        SmartYear smartYear = new SmartYear(2000);
        boolean isLeapYear = smartYear.isLeapYear();

        Assert.assertTrue(isLeapYear);
    }

    @Test
    public void the_year_1990_should_not_be_a_leap_year() throws Exception {
        SmartYear smartYear = new SmartYear(1900);
        boolean isLeapYear = smartYear.isLeapYear();

        Assert.assertTrue(isLeapYear);
    }
}
