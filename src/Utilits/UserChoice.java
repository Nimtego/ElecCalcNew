package Utilits;

import ElectricCalcException.NotCorectEnteringException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
public class UserChoice {
    public static boolean yesOrNot() {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("(y or n)");
        String question = null;
        do {
            try {
                question = read.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (!(question.equals("y") || question.equals("Y") || question.equals("N") || question.equals("n"))) {
                    throw new NotCorectEnteringException("Test", question);
                }
                return question.equals("Y") || question.equals("y");
            } catch (NotCorectEnteringException e) {
                System.out.println(e);
            }
        }
        while (true);
    }

    public static int rangeOfInt(final String mesage, final int from, final int to) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(mesage + " from " + from +" to " + to);
        String numberChoice = null;
        int numberTmp = 0;
        do {
            try {
                numberChoice = read.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (numberChoice != null) {
                    numberTmp = Integer.parseInt(numberChoice);
                }
                if (numberTmp < from || numberTmp > to) {
                    System.out.println("Enter " + from + " - " + to + "!");
                    continue;
                }
                return numberTmp;
            } catch (NumberFormatException e) {
                System.out.println("Not number");
            }
        }
        while(true);
    }
    public static int oneIntOfTwo(final int first, final int second) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entering " +first +" or " +second);
        String choice = null;
        int numberTmp = 0;
        do {
            try {
                choice = read.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (choice != null) {
                    numberTmp = Integer.parseInt(choice);
                }
                if (!(numberTmp == first || numberTmp == second))
                    continue;
                return numberTmp;
            } catch (NumberFormatException e) {
                System.out.println("Not number");
            }
        }
        while(true);
    }
}
