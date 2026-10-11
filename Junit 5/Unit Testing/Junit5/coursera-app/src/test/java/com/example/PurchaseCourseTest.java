package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.services.CoursePurchases;
import com.example.Java;
public class PurchaseCourseTest{
    @Test 
    void testProceedWithCourse(){
        CoursePurchases cp1 = new CoursePurchases();
        CoursePurchases cp2 = new CoursePurchases();
        assertTrue(cp1.proceedWithCourse(new Java()));//Now we were passing course veriable in the bracket of proceed with course....so to that refrence of that we are creating new java object...with rescpet to the course...Now in purchase course file we...Course course = new Java();
        assertFalse(cp2.proceedWithCourse(new Spring()));
    }

}
