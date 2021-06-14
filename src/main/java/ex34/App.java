/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex34;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String[] nameArray = {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        int employees = nameArray.length;
        myApp.printNames(employees, nameArray);
        String removeName = myApp.getInput();
        nameArray = myApp.removeName(removeName, nameArray, employees);

    }

    public String[] removeName(String removeName, String[] nameArray, int employees) {
        int positionToDelete = -1;
        for(int i = 0; i < employees; i++)
        {
            if(nameArray[i].equals(removeName))
            {
                positionToDelete = i;
                break;
            }
        }
        if(positionToDelete >= 0)
        {
            for(int i = positionToDelete; i < employees - 1; i++) {
                nameArray[i] = nameArray[i + 1];
            }

        }
        else
        {
            System.out.println("Not found");
        }
        employees--;
        System.out.print("\n");
        printNames(employees,nameArray);
        return nameArray;
    }

    public void printNames(int employees, String[] list) {
        System.out.println("There are " + employees + " employees:");
        for(int i = 0; i < employees; i++)
            System.out.println(list[i]);
    }

    public String getInput() {
        System.out.print("\nEnter an employee name to remove: ");
        return in.nextLine();
    }

}

