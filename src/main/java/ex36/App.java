/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex36;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        List<Double> numbers;
        numbers = myApp.getNumbers();

        myApp.outputRawNumbers(numbers);

        double average = myApp.average(numbers);
        double minimum = myApp.minimum(numbers);
        double maximum = myApp.maximum(numbers);
        double std = myApp.std(numbers, average);

        myApp.output(average,minimum,maximum,std);
    }

    public void output(double average, double minimum, double maximum, double std) {
        System.out.println("The average is " + String.format("%.1f",average));
        System.out.println("The minimum is " + String.format("%.0f",minimum));
        System.out.println("The maximum is " + String.format("%.0f",maximum));
        System.out.println("The standard deviation is " + String.format("%.2f",std));
    }

    public double std(List<Double> numbers, double average) {
        double std = 0.0;
        for(int i = 0; i < numbers.size(); i++) {
            std += Math.pow(numbers.get(i) - average, 2);
        }
        return Math.sqrt(std / numbers.size());
    }

    public double maximum(List<Double> numbers) {
        return numbers.get(numbers.indexOf(Collections.max(numbers)));
    }

    public double minimum(List<Double> numbers) {
        return numbers.get(numbers.indexOf(Collections.min(numbers)));
    }

    public double average(List<Double> numbers) {
        double sum = 0;
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum is " + sum);
        double average = (sum / numbers.size());
        return average;
    }

    public void outputRawNumbers(List<Double> numbers) {
        System.out.print("Numbers: ");
        for(int i = 0; i < numbers.size(); i++)
        {
            System.out.print(String.format("%.0f",numbers.get(i)));
            if(i < numbers.size() - 1)
            {
                System.out.print(", ");
            }
        }
    }

    public List<Double> getNumbers() {
        List<Double> numbers = new ArrayList<>();
        String input;
        double inputConv;
        while(true)
        {
            System.out.print("Enter a number: ");
            input = in.nextLine();
            if(input.equals("done"))
            {
                break;
            }
            try {
                inputConv = Double.parseDouble(input);
                numbers.add(inputConv);
            } catch (NumberFormatException E) {
                System.out.println("Invalid input");
            }
        }
        return numbers;
    }
}