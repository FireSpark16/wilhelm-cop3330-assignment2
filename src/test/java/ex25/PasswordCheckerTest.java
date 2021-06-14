package ex25;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Note: ex25.java only handles scanned input and output
// and does not require test cases.

class PasswordCheckerTest {

    @Test
    @DisplayName("12345 has letters")
    void checkContainsLetters1() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "12345";
        boolean actual = myPC.containsLetters(input);

        assertFalse(actual);
    }

    @Test
    @DisplayName("abcde has letters")
    void checkContainsLetters2() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "abcde";
        boolean actual = myPC.containsLetters(input);

        assertTrue(actual);
    }

    @Test
    @DisplayName("abc123%$ has letters")
    void checkContainsLetters3() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "abc123%$";
        boolean actual = myPC.containsLetters(input);

        assertTrue(actual);
    }

    @Test
    @DisplayName("12345 has digit")
    void checkContainsDigits1() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "12345";
        boolean actual = myPC.containsNumbers(input);

        assertTrue(actual);
    }

    @Test
    @DisplayName("abcde has digits")
    void checkContainsDigits2() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "abcde";
        boolean actual = myPC.containsNumbers(input);

        assertFalse(actual);
    }

    @Test
    @DisplayName("abc123%$ has digit")
    void checkContainsDigits3() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "abc123%$";
        boolean actual = myPC.containsNumbers(input);

        assertTrue(actual);
    }

    @Test
    @DisplayName("12345 has symbols")
    void checkContainsSymbols1() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "12345";
        boolean actual = myPC.containsSymbols(input);

        assertFalse(actual);
    }

    @Test
    @DisplayName("abcde has symbols")
    void checkContainsSymbols2() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "abcde";
        boolean actual = myPC.containsSymbols(input);

        assertFalse(actual);
    }

    @Test
    @DisplayName("abc123%$ has symbols")
    void checkContainsSymbols3() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "abc123%$";
        boolean actual = myPC.containsSymbols(input);

        assertTrue(actual);
    }

    @Test
    @DisplayName("Full test 12345")
    void checkPasswordTest1() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "12345";
        int expected = 1;
        int actual = myPC.checkPassword(input);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Full test abcdef")
    void checkPasswordTest2() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "abcdef";
        int expected = 2;
        int actual = myPC.checkPassword(input);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Full test abc123xyz")
    void checkPasswordTest3() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "abc123xyz";
        int expected = 3;
        int actual = myPC.checkPassword(input);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Full test abc123xyz")
    void checkPasswordTest4() {
        PasswordChecker myPC = new PasswordChecker();

        String input = "1337h@xor!";
        int expected = 4;
        int actual = myPC.checkPassword(input);

        assertEquals(expected, actual);
    }
}