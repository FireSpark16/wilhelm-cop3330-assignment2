/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex37;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        
        int minLength = myApp.getInput("What's the minimum length? ");
        int chars = myApp.getInput("How many special characters? ");
        int numbs = myApp.getInput("How many numbers? ");
        int requiredLetters = myApp.calcRequiredLetters(minLength,chars,numbs);

        List<Object> password;
        password = myApp.generatePassword(chars, numbs, requiredLetters);

        myApp.output(password);
    }

    public void output(List<Object> password) {
        System.out.print("Your password is ");
        for(int i = 0; i < password.size(); i++)
        {
            System.out.print(password.get(i));
        }
    }

    public List<Object> generatePassword(int chars, int numbs, int requiredLetters) {
        int i = chars, j = numbs, k = requiredLetters;
        List<Object> password = new ArrayList<>();
        while ((i > 0) || (j > 0) || (k > 0))
        {
            int selection = (int) ((Math.random() * 3) + 1);
            switch (selection)
            {
                case 1:
                    if(i > 0)
                    {
                        password.add(getChar());
                        i--;
                        break;
                    }
                    if(j > 0)
                    {
                        password.add(getNumb());
                        j--;
                        break;
                    }
                    if(k > 0)
                    {
                        password.add(getLett());
                        k--;
                        break;
                    }
                    break;
                case 2:
                    if(k > 0)
                    {
                        password.add(getLett());
                        k--;
                        break;
                    }
                    if(i > 0)
                    {
                        password.add(getChar());
                        i--;
                        break;
                    }
                    if(j > 0)
                    {
                        password.add(getNumb());
                        j--;
                        break;
                    }
                    break;
                case 3:
                    if(j > 0)
                    {
                        password.add(getNumb());
                        j--;
                        break;
                    }
                    if(k > 0)
                    {
                        password.add(getLett());
                        k--;
                        break;
                    }
                    if(i > 0)
                    {
                        password.add(getChar());
                        i--;
                        break;
                    }
                    break;
            }
        }
        return password;
    }

    public Object getChar() {
        Random random = new Random();
        return (char) (random.nextInt(10) + '!');
    }

    public Object getNumb() {
        return (int) ((Math.random() * 10));
    }

    public Object getLett() {
        Random random = new Random();
        return (char) (random.nextInt(26) + 'a');
    }

    public int calcRequiredLetters(int minLength, int chars, int numbs) {
        int nonLetters = (chars + numbs);
        int minLetters = nonLetters;
        if(minLetters + nonLetters >= minLength)
            return minLetters;
        minLetters += (minLength - minLetters - nonLetters);
        return minLetters;
    }

    public int getInput(String s) {
        System.out.print(s);
        int amount = 0;
        try {
            amount = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException E) {
            System.out.println("Invalid input");
        }
        return amount;
    }

}
