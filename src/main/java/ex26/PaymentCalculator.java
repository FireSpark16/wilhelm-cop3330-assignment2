package ex26;

public class PaymentCalculator {
    public double calculatePayment(double b, double i, double p) {
        double n = Math.ceil(-(1.0/30.0) * Math.log((1 + b/p * (1 - Math.pow((1 + i),30)))) / Math.log((1 + i)));
        return n;
    }
}
