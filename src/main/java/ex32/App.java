/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex32;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int playAgain = 1;
        System.out.println("Let's play Guess the Number!\n");
        while(playAgain == 1) {
            int difficulty = myApp.getInputDif("Enter the difficulty level (1, 2, or 3): ");
            int bigNumber = 0;
            switch (difficulty) {
                case 1 -> bigNumber = 10;
                case 2 -> bigNumber = 100;
                case 3 -> bigNumber = 1000;
                default -> System.out.println(difficulty + " isn't a valid difficulty.");
            }
            if(bigNumber != 0)
            {
                System.out.print("I have my number. What's your guess? ");
                int answer = myApp.randomValue(bigNumber);
                int counter = 0;
                while(true)
                {
                    int guess = myApp.getInput();
                    counter++;

                    if (guess == answer) {
                        break;
                    } else if(guess == 0) {
                        System.out.print("Guess again: ");
                    } else if(guess > answer) {
                        System.out.print("Too high. Guess again: ");
                    } else {
                        System.out.print("Too low. Guess again: ");
                    }
                }
                System.out.println("You got it in " + counter + " guesses!\n");
            }
            System.out.println("Do you wish to play again (Y/N)? ");
            String response = in.nextLine();
            if (response.equals("N") || response.equals("n"))
            {
                playAgain = 0;
            }
        }
    }

    public int randomValue(int bigNumber) {
        return (int) (Math.random() * (bigNumber - 1)) + 1;
    }

    public int getInput() {
        int input = 0;
        try {
            input = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Waste of a guess. ");
        }
        return input;
    }

    public int getInputDif(String s) {
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