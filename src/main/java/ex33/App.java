/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xander Wilhelm
 */
package ex33;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String dontCare = myApp.getInput("What's your question? ");
        String[] outcomes = {"It is certain","It is decidedly so","Without a doubt","Yes, definitely","You may rely on it","As I see it, yes","Most likely","Outlook good","Yes","Signs point to yes","Reply hazy try again","Ask again later","Better not tell you now","Cannot predict now","Concentrate and ask again","Don't count on it","My reply is no","My sources say no","Outlook not so good","Very doubtful"};
        int rng = myApp.eightBall(outcomes);
        myApp.output(outcomes[rng]);

    }

    public String getInput(String s) {
        System.out.print(s);
        return in.nextLine();
    }

    public void output(String outcome) {
        System.out.println(outcome);
    }

    public int eightBall(String[] outcomes) {
        return (int) (Math.random() * (outcomes.length));
    }

}