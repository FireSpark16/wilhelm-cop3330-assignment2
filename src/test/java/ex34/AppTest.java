package ex34;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("John Smith")
    void removeName1() {
        App myApp = new App();
        String[] list = {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        int employees = list.length;
        list = myApp.removeName("John Smith", list, employees);
        employees = list.length;
        String expected = "Jeremy Goodwin";
        assertEquals(expected,list[employees - 1]);
    }

    @Test
    @DisplayName("None")
    void removeName2() {
        App myApp = new App();
        String[] list = {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        int employees = list.length;
        list = myApp.removeName("", list, employees);
        String expected = "Jeremy Goodwin";
        assertEquals(expected,list[employees - 1]);
    }

    @Test
    @DisplayName("Jeremy Goodwin")
    void removeName3() {
        App myApp = new App();
        String[] list = {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        int employees = list.length;
        list = myApp.removeName("Jeremy Goodwin", list, employees);
        String expected = "Jeremy Goodwin";
        assertEquals(expected,list[employees - 1]);
    }
}