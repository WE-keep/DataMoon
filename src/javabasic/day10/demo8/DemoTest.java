package javabasic.day10.demo8;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void show() {
        assertEquals(12,new Demo().show(6,6));
    }
}