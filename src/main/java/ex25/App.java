/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ex25;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        PasswordChecker myPC = new PasswordChecker();

        String password = myApp.getInput();
        int result = myPC.checkPassword(password);
        myApp.output(result, password);
    }

    private void output(int result, String password) {
        System.out.print("The password \'" + password + "\' is a ");
        switch(result)
        {
            case 0:
                System.out.println("password that doesn't meet the parameters of this test and likely a...");
            case 1:
                System.out.println("very weak password.");
                break;
            case 2:
                System.out.println("weak password.");
                break;
            case 3:
                System.out.println("strong password.");
                break;
            case 4:
                System.out.println("very strong password.");
                break;
        }
    }

    private String getInput() {
        System.out.print("Enter the password you wish to have checked: ");
        return in.nextLine();
    }

}
