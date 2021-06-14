/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex27;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int[] errors;

        String firstName = myApp.getInput("Enter the first name: ");
        String lastName = myApp.getInput("Enter the last name: ");
        String zipCode = myApp.getInput("Enter the ZIP code: ");
        String id = myApp.getInput("Enter the employee ID: ");

        errors = myApp.validateInput(firstName,lastName,zipCode,id);

        myApp.output(errors);

    }

    public void output(int[] errors) {
        boolean result = checkResult(errors);
        String[] errorCodes = {"The first name must be filled in.", "The last name must be filled in.", "The zip code must be filled in.", "The ID must be filled in.", "The first name must be at least 2 characters long.", "The last name must be at least 2 characters long.", "The zipcode must be a 5 digit number.", "The employee ID must be in the format of AA-1234."};
        if(result)
        {
            for(int i = 0; i < 8; i++)
            {
                if(errors[i] == 1)
                    System.out.println(errorCodes[i]);
            }
        }
        else
            System.out.println("There were no errors found.");
    }

    public boolean checkResult(int[] errors) {
        for(int i = 0; i < 8; i++)
        {
            if(errors[i] != 0)
                return true;
        }
        return false;
    }

    /*
     * errors[0] = is firstName blank? errors[1] = is lastName blank? errors[2] = is zipCode blank? errors[3] = is id blank?
     * errors[4] = is firstName >= 2 chars? errors[5] = is lastName >= 2 chars? errors[6] = is zipCode formatted correctly? errors[7] = is id formatted correctly?
     */

    public int[] validateInput(String firstName, String lastName, String zipCode, String id) {
        int[] errors = new int[8];
        errors[0] = isBlank(firstName) ? 1 : 0;
        errors[1] = isBlank(lastName) ? 1 : 0;
        errors[2] = isBlank(zipCode) ? 1 : 0;
        errors[3] = isBlank(id) ? 1 : 0;
        errors[4] = isNotAtLeast2(firstName) ? 1 : 0;
        errors[5] = isNotAtLeast2(lastName) ? 1 : 0;
        errors[6] = isZipIncorrect(zipCode) ? 1 : 0;
        errors[7] = isidIncorrect(id) ? 1 : 0;
        return errors;
    }

    public boolean isidIncorrect(String id) {
        if (id.isEmpty())
            return true;
        if(!(Character.isLetter(id.charAt(0))))
            return true;
        if(!(Character.isLetter(id.charAt(1))))
            return true;
        if(id.charAt(2) != '-')
            return true;
        if(!(Character.isDigit(id.charAt(3))))
            return true;
        if(!(Character.isDigit(id.charAt(4))))
            return true;
        if(!(Character.isDigit(id.charAt(5))))
            return true;
        return !(Character.isDigit(id.charAt(6)));
    }

    public boolean isZipIncorrect(String zipCode) {
        if(zipCode.length() != 5)
            return true;
        for (int i = 0; i < 5; i++)
            if (!(Character.isDigit(zipCode.charAt(i))))
                return true;
        return false;
    }

    public boolean isNotAtLeast2(String s) {
        return s.length() < 2;
    }

    public boolean isBlank(String s) {
        return s.trim().isEmpty();
    }

    public String getInput(String s) {
        System.out.println(s);
        return in.nextLine();
    }

}
