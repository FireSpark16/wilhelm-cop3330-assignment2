/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex29;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double ror = myApp.getror();
        double years = myApp.calc(ror);
        myApp.output(years);
    }

    private void output(double years) {
        System.out.println("It will take " + String.format("%.2f", years) + " years to double your initial investment.");
    }

    public double calc(double ror) {
        return 72 / ror;
    }

    private double getror() {
        double input;
        while (true) {
            System.out.print("What is the rate of return? ");
            try {
                input = Double.parseDouble(in.nextLine());
                if(input != 0)
                    break;
                else
                    System.out.println("Sorry. That's not a valid input.");
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        return input;
    }
}