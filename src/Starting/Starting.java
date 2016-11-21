package Starting;

import Controllers.ColectMenu;
import Operation.ListCalculationOperation;
import Utilits.UserChoice;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
class Starting {
    public static void main(String[] args) {
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
    }
}
