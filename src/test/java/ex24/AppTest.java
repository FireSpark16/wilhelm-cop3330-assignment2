package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("note and tone")
    void checkIsAnagram1() {
        App myApp = new App();
        char[] word1 = {'n','o','t','e'};
        char[] word2 = {'t','o','n','e'};
        boolean actual = myApp.checkIfAnagram(word1, word2,4, 4);

        assertTrue(actual); //actual should be true
    }

    @Test
    @DisplayName("book and cook")
    void checkIsAnagram2() {
        App myApp = new App();
        char[] word1 = {'b','o','o','k'};
        char[] word2 = {'c','o','o','k'};
        boolean actual = myApp.checkIfAnagram(word1, word2,4, 4);

        assertFalse(actual); // actual should be false
    }

    @Test
    @DisplayName("numerical and symbolic inputs")
    void checkIsAnagram3() {
        App myApp = new App();
        char[] word1 = {'-','8','#'};
        char[] word2 = {'8','-','#'};
        boolean actual = myApp.checkIfAnagram(word1, word2,3, 3);

        assertTrue(actual); // actual should be true
    }
}