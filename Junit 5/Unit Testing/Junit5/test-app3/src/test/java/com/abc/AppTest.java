package com.abc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseStringTest{
    @Test //This notation is very important to mark the method as an test.
    protected void reverseOneWord(){  
        ReverseString r1 =new ReverseString();
        String actualValue = r1.reverseString("Java");
        String expectedValue = "avaJ";
        assertEquals(expectedValue, actualValue);

        ReverseString r2 =new ReverseString();
        //we can write everything in 1 line
        assertEquals("YahbA",r2.reverseString("AbhaY"));
    }
    @Test 
    void reverseMultipleWords(){
        ReverseString r3 =new ReverseString();
        // r3.reverseString("Abhay Loves Java")...this is the catual one.
        assertEquals("avaJ sevoL yahbA", r3.reverseString("Abhay Loves Java"));
    }//mvn -Dtest=ReverseStringTest#reverseMultipleWords test---syntax to run this perticular test
}
