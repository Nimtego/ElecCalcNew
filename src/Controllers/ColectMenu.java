package Controllers;

import Operation.ListCalculationOperation;
import Operation.ObjMenu;

import java.util.ArrayList;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
public class ColectMenu {
    public static void arrayColectionMenu() {
        printMenu(ListCalculationOperation.getMenu());
    }
    public static void printMenu(ArrayList<ObjMenu> menu) {
        for (int numberOfOperation = 0; numberOfOperation < menu.size(); numberOfOperation++) {
            System.out.println(" " +(numberOfOperation+1) +" - " +menu.get(numberOfOperation));
        }
    }
}
