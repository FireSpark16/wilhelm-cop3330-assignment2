package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getMaxLength() {
        App myApp = new App();

        int[][] valArray;
        valArray = myApp.getArray();
        int expected = 3;
        int actual = myApp.getMaxLength(valArray);
        assertEquals(expected,actual);
    }
}