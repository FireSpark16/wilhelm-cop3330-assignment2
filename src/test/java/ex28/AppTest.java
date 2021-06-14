package ex28;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

//This program is all inputs and output based, so I attempted local parameter tests for practice.
class AppTest {
    App myApp = new App();
    @ParameterizedTest
    @CsvSource(value = {"1.0,2.0,3.0,4.0,5.0,15.0","2.0,4.0,6.0,8.0,10.0,30.0"})

    void testSum1(double val1, double val2, double val3, double val4, double val5, double expected) {
        double sum = val1 + val2 + val3 + val4 + val5;
        double expectedResult = expected;
        assertEquals(sum,expectedResult);
    }
}