/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ex26;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        PaymentCalculator myPC = new PaymentCalculator();

        double b = Math.ceil(myApp.getInput("What is your balance? ") * 100) / 100;
        double apr = (myApp.getInput("What is the APR on the card (as a percent)? ")) / 100;
        double i = apr / 365;
        double p = myApp.getInput("What is the monthly payment you can make? ");

        double months = myPC.calculatePayment(b,i,p);
        System.out.println("It will take you " + String.format("%.0f",months) + " months to pay off this card.");
    }

    private double getInput(String s) {
        System.out.print(s);
        return Double.parseDouble(in.nextLine());
    }
}