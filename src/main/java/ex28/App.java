/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex28;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double sum = 0.0;
        for(int i = 0; i < 5; i++)
            sum += myApp.getInput();
        myApp.output(sum);
    }

    private void output(double sum) {
        System.out.println("The total is " + String.format("%.0f", sum) + ".");
    }

    public double getInput() {
        System.out.print("Enter a number: ");
        return Double.parseDouble(in.nextLine());
    }

}
