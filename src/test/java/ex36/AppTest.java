package ex36;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class AppTest {

    @Test
    void std() {
        App myApp = new App();

        List<Double> numberList = new ArrayList<>();
        numberList.add(100.0);
        numberList.add(200.0);
        numberList.add(1000.0);
        numberList.add(300.0);
        double average = myApp.average(numberList);
        double std = myApp.std(numberList, average);
        double expected = 353.55;
        assertEquals(std, expected, 0.01);
    }

    @Test
    void maximum() {
        App myApp = new App();

        List<Double> numberList = new ArrayList<>();
        numberList.add(100.0);
        numberList.add(200.0);
        numberList.add(1000.0);
        numberList.add(300.0);
        double maximum = myApp.maximum(numberList);
        double expected = 1000.0;
        assertEquals(maximum, expected, 0.01);
    }

    @Test
    void minimum() {
        App myApp = new App();

        List<Double> numberList = new ArrayList<>();
        numberList.add(100.0);
        numberList.add(200.0);
        numberList.add(1000.0);
        numberList.add(300.0);
        double minimum = myApp.minimum(numberList);
        double expected = 100.0;
        assertEquals(minimum, expected, 0.01);
    }

    @Test
    void average() {
        App myApp = new App();

        List<Double> numberList = new ArrayList<>();
        numberList.add(100.0);
        numberList.add(200.0);
        numberList.add(1000.0);
        numberList.add(300.0);
        double average = myApp.average(numberList);
        double expected = 400.0;
        assertEquals(average, expected, 0.01);
    }
}