package Controllers;

import Operation.ListCalculationOperation;
import Operation.ObjOperation;

import java.util.ArrayList;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
public class ColectMenu {
    public static void arrayColectionMenu(ListCalculationOperation list) {
        printMenu(list.getMenu());
    }
    public static void printMenu(ArrayList<ObjOperation> menu) {
        for (int numberOfOperation = 0; numberOfOperation < menu.size(); numberOfOperation++) {
            System.out.println(" " +(numberOfOperation+1) +" - " +menu.get(numberOfOperation));
        }
    }
}
