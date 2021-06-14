/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String initialInput = myApp.getInitialInput();
        String[] inputArray = myApp.convertToArray(initialInput);
        ArrayList<String> evenList = myApp.makeEvenArray(inputArray);
        myApp.output(evenList);
    }

    public ArrayList<String> makeEvenArray(String[] inputArray) {
        ArrayList<String> evenList = new ArrayList<>();
        for (String s : inputArray) {
            if (Double.parseDouble(s) % 2 == 0) {
                evenList.add(s);
            }
        }
        return evenList;
    }

    public String[] convertToArray(String initialInput) {
        return initialInput.split(" ");
    }

    public String getInitialInput() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        return in.nextLine();
    }

    public void output(ArrayList<String> evenList) {
        System.out.print("The even numbers are");
        for (String c : evenList) {
            System.out.print(" " + c);
        }
        System.out.print(".");
    }

}
        