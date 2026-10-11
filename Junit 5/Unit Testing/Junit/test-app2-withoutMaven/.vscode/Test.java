package com.abc;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test {
    @Test 
    public void t1(){
        ReverseString r1 = new ReverseString();
        String actualString = r1.reverse("Java");
        String expectedString = "avaJ";

        assertEquals(expectedString,actualString);
    }
}
