/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex39;

import java.util.*;
import java.util.stream.Stream;
import java.io.*;
import java.lang.*;


public class App {

    public static void main(String[] args) {
        App myApp = new App();

        String[] initialFName = {"John","Tou","Michaela","Jake","Jacquelyn","Sally"};
        String[] initialLName = {"Johnson","Xiong","Michaelson","Jacobson","Jackson","Webber"};
        String[] initialPosition = {"Manager","Software Engineer","District Manager","Programmer","DBA","Web Developer"};
        String[] initialSeparationDate = {"2016-12-31","2016-10-05","2015-12-19","","","2015-12-18"};

        ArrayList<Map> data = new ArrayList<>();
        for(int i = 0; i < initialFName.length; i++) {
            HashMap<String, String> newMap = new HashMap<>();
            newMap.put("First Name", initialFName[i]);
            newMap.put("Last Name", initialLName[i]);
            newMap.put("Position", initialPosition[i]);
            newMap.put("Separation Date", initialSeparationDate[i]);
            data.add(newMap);
        }
        int dataSize = myApp.getDataSize(data);
        data = myApp.sortData(data, dataSize);

        myApp.output(data);

    }

    public void output(ArrayList<Map> data) {
        System.out.println("Name                 | Position          | Separation Date");
        System.out.println("----------------------------------------------------------");
        for(int i = 0; i < data.size(); i++)
        {
            String fAndL = data.get(i).get("First Name") + " " + data.get(i).get("Last Name");
            int length = fAndL.length();
            if(length < 20)
            {
                for(int j = 0; j < 20 - length; j++)
                {
                    fAndL += " ";
                }
            }
            System.out.print(fAndL + " | ");
            String position = data.get(i).get("Position").toString();
            length = position.length();

            if(length < 17)
            {
                for(int j = 0; j < 17 - length; j++)
                {
                    position += " ";
                }
            }
            System.out.print(position + " | " + data.get(i).get("Separation Date").toString() + "\n");
        }
    }

    public int getDataSize(ArrayList<Map> data) {
        return data.size();
    }

    public ArrayList<Map> sortData(ArrayList<Map> data, int dataSize) {
        int n = dataSize;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if((data.get(j).get("Last Name")).toString().compareTo((data.get(j + 1).get("Last Name")).toString()) > 0)
                {
                    Collections.swap(data, j, j+1);
                }
        return data;
    }
}

