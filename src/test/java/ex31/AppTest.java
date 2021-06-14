package ex31;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("55")
    void calculate1() {
        App myApp = new App();

        double expected = 138;
        double actual = myApp.calculate(22, 65, 55);
        assertEquals(expected,actual,0.99);
    }

    @Test
    @DisplayName("65")
    void calculate2() {
        App myApp = new App();

        double expected = 151;
        double actual = myApp.calculate(22, 65, 65);
        assertEquals(expected,actual,0.99);
    }

    @Test
    @DisplayName("95")
    void calculate3() {
        App myApp = new App();

        double expected = 191;
        double actual = myApp.calculate(22, 65, 95);
        assertEquals(expected,actual,0.99);
    }
}