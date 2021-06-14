/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex30;

public class App {

    public static void main(String[] args) {
        App myApp = new App();

        int[][] valArray;
        valArray = myApp.getArray();

        String[][] stringArray;
        int maxLength = myApp.getMaxLength(valArray);
        stringArray = myApp.convertArray(valArray, maxLength);
        myApp.output(stringArray);
    }

    private void output(String[][] stringArray) {
        for(int i = 0; i < 12; i++)
        {
            for(int j = 0; j < 12; j++) {
                System.out.print(stringArray[i][j] + "   ");
            }
            System.out.print("\n");
        }
    }

    public String[][] convertArray(int[][] valArray, int maxLength) {
        String[][] stringArray = new String[12][12];
        for(int i = 0; i < 12; i++)
        {
            for(int j = 0; j < 12; j++)
            {
                int length = String.valueOf(valArray[i][j]).length();
                int difference = maxLength - length;
                StringBuilder additionalSpace = new StringBuilder();
                for(int k = 0; k < difference; k++)
                {
                    additionalSpace.insert(0, " ");
                }
                stringArray[i][j] = additionalSpace.toString() + valArray[i][j];
            }
        }
        return stringArray;
    }
    
    public int getMaxLength(int[][] valArray) {
        return String.valueOf(valArray[11][11]).length();
    }

    public int[][] getArray() {
        int[][] Array = new int[12][12];
        for(int i = 0; i < 12; i++)
        {
            for(int j = 0; j < 12; j++)
            {
                Array[i][j] = ((i + 1) * (j + 1));
            }
        }
        return Array;
    }

}
