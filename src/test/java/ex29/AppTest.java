package ex29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Math for 4")
    void math1() {
        App myApp = new App();
        double input = 4;
        double expected = 18;
        double actual = myApp.calc(input);
        assertEquals(expected,actual,0.001);
    }

    @Test
    @DisplayName("Math for 8")
    void math2() {
        App myApp = new App();
        double input = 8;
        double expected = 9;
        double actual = myApp.calc(input);
        assertEquals(expected,actual,0.001);
    }

}