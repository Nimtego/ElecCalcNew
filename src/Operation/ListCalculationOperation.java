package Operation;

import Operation.ListOperation.GraundConection.GraundConection;
import Operation.ListOperation.LightCalc.LightCalc;

import java.util.ArrayList;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
public class ListCalculationOperation {
    private static final ArrayList<ObjMenu> menu = new ArrayList<ObjMenu>();

    // ListCalculationOperation() {
// creatListOfOperation(new LightCalc());
// }
    public static ArrayList<ObjMenu> getMenu() {
        creatListOfOperation(new LightCalc(), new GraundConection(), new LightCalc("Other", "F"));
        return menu;
    }
    private static void creatListOfOperation(ObjMenu... arrOperation) {
        for (ObjMenu operation : arrOperation) {
            menu.add(0, operation);
        }
    }
    public static ObjMenu getObjMenuByNumber(int number) {
        return menu.get(number);
    }
}
