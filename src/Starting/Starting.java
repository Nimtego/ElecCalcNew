package Starting;

import Controllers.ColectMenu;
import Operation.ListCalculationOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
class Starting {
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ColectMenu.arrayColectionMenu();
        System.out.println("Entering number");
        while(true) {
            String question = null;
            try {
                question = read.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(!question.equals("e") || !question.equals("E")) {
                int num;
                try {
                    num = Integer.parseInt(question);
                    try {
                        if (!(num >= 0) && !(num <= ListCalculationOperation.getMenu().size()))
                            throw new IndexOutOfBoundsException();
                        ListCalculationOperation.getObjMenuByNumber(num - 1).menuAction();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Not correct number");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Not correct symbol entering");
                }
            }
            System.out.println("Good buy");
            break;
        }
    }
}
