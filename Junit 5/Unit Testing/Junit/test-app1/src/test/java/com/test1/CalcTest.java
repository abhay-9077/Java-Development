package com.test1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalcTest{
    
    @Test
    public void t1(){
        System.out.println("First junit run");
    }
    @Test 
    public void t2(){
        assertEquals("Java","Java");
    }
    @Test 
    public void t3(){
        Calc c1 = new Calc();
        int actualValue = c1.divide(10,5);
        int expectedValue = 2;
        assertEquals(actualValue,expectedValue);
    }
}