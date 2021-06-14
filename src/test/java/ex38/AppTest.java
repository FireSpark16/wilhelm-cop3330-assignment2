package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void makeEvenArray1() {
        App myApp = new App();

        String[] inputArray = {"1","2","3","4","5","6","7","8"};
        ArrayList<String> evenList = myApp.makeEvenArray(inputArray);
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("2");
        expectedList.add("4");
        expectedList.add("6");
        expectedList.add("8");
        assertEquals(evenList,expectedList);
    }
    @Test
    void makeEvenArray2() {
        App myApp = new App();

        String[] inputArray = {"10","23","31","44","58","67","71","82"};
        ArrayList<String> evenList = myApp.makeEvenArray(inputArray);
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("10");
        expectedList.add("44");
        expectedList.add("58");
        expectedList.add("82");
        assertEquals(evenList,expectedList);
    }

}