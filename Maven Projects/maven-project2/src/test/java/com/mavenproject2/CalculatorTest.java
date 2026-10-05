//Now we will test that class in this file....this is the test file
//@test for this annotation we have added the dependency of jupiter API
//Junit is needed for test in any condition

package com.mavenproject2;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest{
    @Test//An annotation... If Any exceptions thrown by the test will be reported by JUnit as a failure. If no exceptions are thrown, the test is assumed to have succeeded.
    void testCalculator(){
        Calculator c2= new Calculator();
        int actualResult = c2.devide(10,5);//Now if we made 5 - 2 then there will be a build failure [ERROR] Failures:[ERROR]   CalculatorTest.testCalculator:16 expected:<2> but was:<5>[INFO][ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0 
        int expectedResult = 2;

        //Now we have to set our expections....by using assert equals method....so we have to import--import static org.junit.Assert.assertEquals
        assertEquals(expectedResult, actualResult);
    }
}
//this build 100 correctly
