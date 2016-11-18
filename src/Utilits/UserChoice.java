package Utilits;

import ElectricCalcException.NotCorectEnteringException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReference;

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
                if (!(question.equals("y")) || !(question.equals("y")) || !(question.equals("y")) || !(question.equals("y")))
                    throw new NotCorectEnteringException();
                return question.equals("y") || question.equals("y");
            } catch (NotCorectEnteringException e) {
                System.out.println(e);
            }
        }
        while(true);
    }
    public static int rangeOfInt(final int from, final int to) {return 0;}
}
