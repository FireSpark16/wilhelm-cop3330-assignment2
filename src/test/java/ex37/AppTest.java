package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calcRequiredLetters1() {
        App myApp = new App();

        int minLength = 8;
        int chars = 2;
        int numbs = 2;
        int minLetters = myApp.calcRequiredLetters(minLength,chars,numbs);
        int expected = 4;
        assertEquals(minLetters,expected);
    }

    @Test
    void calcRequiredLetters2() {
        App myApp = new App();

        int minLength = 10;
        int chars = 1;
        int numbs = 2;
        int minLetters = myApp.calcRequiredLetters(minLength,chars,numbs);
        int expected = 7;
        assertEquals(minLetters,expected);
    }

    @Test
    void calcRequiredLetters3() {
        App myApp = new App();

        int minLength = 15;
        int chars = 6;
        int numbs = 6;
        int minLetters = myApp.calcRequiredLetters(minLength,chars,numbs);
        int expected = 12;
        assertEquals(minLetters,expected);
    }
}