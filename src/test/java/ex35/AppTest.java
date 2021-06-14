package ex35;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class AppTest {

    @Test
    @DisplayName("5 items")
    void rng1() {
        App myApp = new App();
        List<String> contestants = new ArrayList<String>();
        contestants.add("1");
        contestants.add("2");
        contestants.add("3");
        contestants.add("4");
        contestants.add("5");
        int min = 0;
        int max = 4;
        int rng = myApp.rng(contestants);
        assertTrue(rng >= min);
        assertTrue(rng <= max);
    }

    @Test
    @DisplayName("7 items")
    void rng2() {
        App myApp = new App();
        List<String> contestants = new ArrayList<String>();
        contestants.add("1");
        contestants.add("2");
        contestants.add("3");
        contestants.add("4");
        contestants.add("5");
        contestants.add("6");
        contestants.add("7");
        int min = 0;
        int max = 6;
        int rng = myApp.rng(contestants);
        assertTrue(rng >= min);
        assertTrue(rng <= max);
    }
}