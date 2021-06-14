package ex32;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Between 1-10")
    void test1() {
        App myApp = new App();
        int low = 1;
        int bignumber = 10;
        int random = myApp.randomValue(bignumber);
        assertTrue(random <= bignumber);
        assertTrue(random >= low);
    }

    @Test
    @DisplayName("Between 1-100")
    void test2() {
        App myApp = new App();
        int low = 1;
        int bignumber = 100;
        int random = myApp.randomValue(bignumber);
        assertTrue(random <= bignumber);
        assertTrue(random >= low);
    }

    @Test
    @DisplayName("Between 1-1000")
    void test3() {
        App myApp = new App();
        int low = 1;
        int bignumber = 1000;
        int random = myApp.randomValue(bignumber);
        assertTrue(random <= bignumber);
        assertTrue(random >= low);
    }
}