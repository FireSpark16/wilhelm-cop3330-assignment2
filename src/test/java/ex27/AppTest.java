package ex27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App myApp = new App();

    @Test
    @DisplayName("full test...bad values")
    void fullTest1() {
        int[] actual = myApp.validateInput("J","W","ABCDE","A12-1234");
        int[] expected = {0,0,0,0,1,1,1,1};
        assertArrayEquals(actual,expected);
    }

    @Test
    @DisplayName("full test...blank values")
    void fullTest2() {
        int[] actual = myApp.validateInput("","","","");
        int[] expected = {1,1,1,1,1,1,1,1};
        assertArrayEquals(actual,expected);
    }

    @Test
    @DisplayName("full test...good values")
    void fullTest3() {
        int[] actual = myApp.validateInput("John","Johnson","55555","AA-1234");
        int[] expected = {0,0,0,0,0,0,0,0};
        assertArrayEquals(actual,expected);
    }

    @Test
    @DisplayName("is blank 'abcd'")
    void isBlank1() {
        String input = "abcd";
        boolean result = myApp.isBlank(input);
        assertFalse(result);
    }

    @Test
    @DisplayName("is blank '1234'")
    void isBlank2() {
        String input = "1234";
        boolean result = myApp.isBlank(input);
        assertFalse(result);
    }

    @Test
    @DisplayName("is blank ''")
    void isBlank3() {
        String input = "";
        boolean result = myApp.isBlank(input);
        assertTrue(result);
    }

    @Test
    @DisplayName("is blank '      '")
    void isBlank4() {
        String input = " ";
        boolean result = myApp.isBlank(input);
        assertTrue(result);
    }

    @Test
    @DisplayName("is !>= 2 'a'")
    void isNotAtLeast21() {
        String input = "a";
        boolean result = myApp.isNotAtLeast2(input);
        assertTrue(result);
    }

    @Test
    @DisplayName("is !>= 2 ''")
    void isNotAtLeast22() {
        String input = "";
        boolean result = myApp.isNotAtLeast2(input);
        assertTrue(result);
    }

    @Test
    @DisplayName("is !>= 2 'Ju'")
    void isNotAtLeast23() {
        String input = "Ju";
        boolean result = myApp.isNotAtLeast2(input);
        assertFalse(result);
    }

    @Test
    @DisplayName("is !>= 2 'Julian'")
    void isNotAtLeast24() {
        String input = "Julian";
        boolean result = myApp.isNotAtLeast2(input);
        assertFalse(result);
    }

    @Test
    @DisplayName("is zipcode right 'abcde'")
    void isZipIncorrect1() {
        String input = "abcde";
        boolean result = myApp.isZipIncorrect(input);
        assertTrue(result);
    }

    @Test
    @DisplayName("is zipcode right ''")
    void isZipIncorrect2() {
        String input = "";
        boolean result = myApp.isZipIncorrect(input);
        assertTrue(result);
    }

    @Test
    @DisplayName("is zipcode right '123456'")
    void isZipIncorrect3() {
        String input = "123456";
        boolean result = myApp.isZipIncorrect(input);
        assertTrue(result);
    }

    @Test
    @DisplayName("is zipcode right '12345'")
    void isZipIncorrect4() {
        String input = "12345";
        boolean result = myApp.isZipIncorrect(input);
        assertFalse(result);
    }

    @Test
    @DisplayName("is id right 'abcde'")
    void isidIncorrect1() {
        String input = "abcde";
        boolean result = myApp.isidIncorrect(input);
        assertTrue(result);
    }

    @Test
    @DisplayName("is id right '12345'")
    void isidIncorrect2() {
        String input = "12345";
        boolean result = myApp.isidIncorrect(input);
        assertTrue(result);
    }

    @Test
    @DisplayName("is id right ''")
    void isidIncorrect3() {
        String input = "";
        boolean result = myApp.isidIncorrect(input);
        assertTrue(result);
    }

    @Test
    @DisplayName("is id right 'AB-1234'")
    void isidIncorrect4() {
        String input = "AB-1234";
        boolean result = myApp.isidIncorrect(input);
        assertFalse(result);
    }
}