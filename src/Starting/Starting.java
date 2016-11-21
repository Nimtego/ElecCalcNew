package Starting;

import Controllers.ColectMenu;
import Operation.ListCalculationOperation;
import Utilits.UserChoice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
class Starting {
    public static void main(String[] args) {
 //       System.out.println(UserChoice.yesOrNot()); //test
//        System.out.println(UserChoice.rangeOfInt("Null", 2, 8)); //test
//        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ListCalculationOperation listOperation = new ListCalculationOperation();
        int numberTmp = 0;
        for(;;) {
            ColectMenu.arrayColectionMenu(listOperation);
            numberTmp = UserChoice.rangeOfInt("Entering number", 1, listOperation.getMenu().size());
            try {
                listOperation.getObjMenuByNumber(numberTmp - 1).menuAction();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Err");
            }
        }
/*        System.out.println("Entering number");
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
        }*/
    }
}
