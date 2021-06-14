/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ex24;

import java.util.Scanner;
import java.util.Arrays;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String word1string = myApp.getWord("Enter the first string: ");
        String word2string = myApp.getWord("Enter the second string: ");

        char[] word1 = word1string.toCharArray();
        char[] word2 = word2string.toCharArray();

        int length1 = myApp.getLength(word1);
        int length2 = myApp.getLength(word2);

        boolean result = myApp.checkIfAnagram(word1, word2, length1, length2);

        myApp.output(result, word1string, word2string);

    }

    private void output(boolean result, String word1string, String word2string) {
        if(result)
        {
            System.out.println("\"" + word1string + "\" and \"" + word2string +"\" are anagrams.");
        } else {
            System.out.println("\"" + word1string + "\" and \"" + word2string +"\" are not anagrams.");
        }
    }

    public boolean checkIfAnagram(char[] word1, char[] word2, int length1, int length2) {
        if(length1 == length2)
        {
            Arrays.sort(word1);
            Arrays.sort(word2);
            for (int i = 0; i < length1; i++) {
                if (word1[i] != word2[i]) {
                    return false;
                }
            }
            return true;
        }
        else
            return false;
    }

    private int getLength(char[] word) {
        return word.length;
    }

    private String getWord(String s) {
        System.out.print(s);
        return in.nextLine();
    }

}
