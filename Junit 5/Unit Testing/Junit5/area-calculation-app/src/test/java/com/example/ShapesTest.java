package com.example;

import static org.junit.jupiter.api.Assertions.*;//imp package
import org.junit.jupiter.api.Test;

class ShapeTest{
    
    @Test 
    void testCalculateSquareArea(){
        Shape s1 = new Shape();
        s1.calculateSquareArea(20);
        assertEquals(400,s1.calculateSquareArea(20));
    }
    @Test 
    void testCalculateCircleArea(){
        Shape s1 = new Shape();
        s1.calculateCircleArea(7);
        assertEquals(62.800000000000004,s1.calculateCircleArea(10),"Area of circle is wrong");//this message will only print when the test fail...but it is evaluated every single time.
        assertNotEquals(0,s1.calculateCircleArea(10),"Radius can't be zero");
    }
    //Now we will print the came message but by using supplier functional interface(functional so lambda expression can be used)---- we just have to add ()->"The Message"
    @Test 
    void testCalculateCircleArea_Supplier(){
        Shape s1 = new Shape();
        s1.calculateCircleArea(7);
        assertEquals(62.800000000000004,s1.calculateCircleArea(10),()->"Area of circle is wrong");//if assertion passed thien only message is evaluated and printed
        assertNotEquals(0,s1.calculateCircleArea(7),()->"Radius can't be zero");
    }
    void test(){
        String str = "Junit";
        assertTrue(str.equals("Junit"));//if both values are not same test case will fail
    }
    /*
    Lambda function is more efficient becoz message is not procsses every single time. 
     */


}
