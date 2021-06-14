package ex26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    @DisplayName("5000, 12, 100")
    void obtainsCorrectOutput1() {
        PaymentCalculator myPC = new PaymentCalculator();

        double expected = 70.0;
        double actual = myPC.calculatePayment(5000,12.0/100.0/365.0,100);

        assertEquals(actual, expected, 0.0001);
    }

    @Test
    @DisplayName("2500, 14, 90")
    void obtainsCorrectOutput2() {
        PaymentCalculator myPC = new PaymentCalculator();

        double expected = 34;
        double actual = myPC.calculatePayment(2500.0,14.0/100.0/365.0,90.0);

        assertEquals(actual, expected, 0.0001);
    }
}