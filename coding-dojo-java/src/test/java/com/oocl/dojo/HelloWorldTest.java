package com.oocl.dojo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {
    @Test
    public void test(){
        assertThat(true, is(true));
    }
}
