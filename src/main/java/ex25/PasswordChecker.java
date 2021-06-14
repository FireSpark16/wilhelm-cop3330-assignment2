/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ex25;

public class PasswordChecker {

    public int checkPassword(String password) {
        PasswordChecker myPC = new PasswordChecker();

        int passwordLength = password.length();
        boolean containsNumbers = myPC.containsNumbers(password);
        boolean containsLetters = myPC.containsLetters(password);
        boolean containsSymbols = myPC.containsSymbols(password);

        return determinePasswordStrength(passwordLength, containsNumbers, containsLetters, containsSymbols);
    }

    private int determinePasswordStrength(int passwordLength, boolean containsNumbers, boolean containsLetters, boolean containsSymbols) {
        if(passwordLength < 7)
        {
            if(containsNumbers && !containsLetters && !containsSymbols)
                return 1;
            else if(!containsNumbers && containsLetters && !containsSymbols)
                return 2;
            else
                return 0;
        } else {
            if (containsNumbers && containsLetters)
                if(containsSymbols)
                    return 4;
                else
                    return 3;
            else
                return 0;
        }
    }

    public boolean containsSymbols(String password) {
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for(char ch : password.toCharArray())
            if(specialCharactersString.contains(Character.toString(ch)))
                return true;
        return false;
    }

    public boolean containsLetters(String password) {
        for(char ch : password.toCharArray())
            if(Character.isLetter(ch))
                return true;
        return false;
    }

    public boolean containsNumbers(String password) {
        for(char ch : password.toCharArray())
            if(Character.isDigit(ch))
                return true;
        return false;
    }
}
