/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex35;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        List contestants;
        contestants = myApp.getContestants();
        int rng = myApp.rng(contestants);
        myApp.output(rng, contestants);
    }

    public void output(int rng, List contestants) {
        if(contestants.size() == 0)
            System.out.println("No names were entered.");
        else
            System.out.println("The winner is... " + contestants.get(rng) + ".");
    }

    public int rng(List contestants) {
        return (int) (Math.random() * (contestants.size()));
    }

    public ArrayList<String> getContestants() {
        List contestants = new ArrayList<String>();
        while(true)
        {
            System.out.print("Enter a name: ");
            String input = in.nextLine();
            if(input.equals(""))
            {
                break;
            }
            else
            {
                contestants.add(input);
            }
        }
        return (ArrayList<String>) contestants;
    }
}
