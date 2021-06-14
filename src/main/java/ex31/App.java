/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex31;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int age = myApp.getInput("What is your age? ");
        int resting = myApp.getInput("What is your resting heart rate? ");
        
        double[][] values;
        values = myApp.calcVals(age,resting);

        myApp.output(age, resting, values);
    }

    private void output(int age, int resting, double[][] values) {
        System.out.println("Resting Pulse: " + resting + "\tAge: " + age + "\n");
        System.out.println("Intensity    | Rate");
        System.out.println("----------------------");
        for(int i = 0; i < 9; i++)
        {
            System.out.println(String.format("%.0f", values[i][0]) + "%          | " + String.format("%.0f", values[i][1]) + " bpm");
        }
    }

    public double[][] calcVals(int age, int resting) {
        double[][] values = new double[9][2];
        for(int i = 0; i < 9; i++){
            values[i][0] = 55 + (i * 5);
            values[i][1] = calculate(age,resting, values[i][0]);
        }
        return values;
    }

    public double calculate(int age, int resting, double intensity) {
        return (((220 - age) - resting) * (intensity / 100)) + resting;
    }

    public int getInput(String s) {
        int input;
        while (true) {
            System.out.print(s);
            try {
                input = Integer.parseInt(in.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        return input;
    }
}
