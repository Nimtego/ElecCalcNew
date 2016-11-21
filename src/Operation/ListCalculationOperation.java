package Operation;

import Operation.ListOperation.GraundConection.GraundConection;
import Operation.ListOperation.LightCalc.LightCalc;
import Operation.ListOperation.PowerCalculator.PowerCalc;

import java.util.ArrayList;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
public class ListCalculationOperation {
    private static final ArrayList<ObjOperation> menu = new ArrayList<>();

    public ListCalculationOperation() {
        creatListOfOperation(new LightCalc(),
                             new GraundConection(),
                             new PowerCalc());
    }
    public ArrayList<ObjOperation> getMenu() {return menu;}
    private void creatListOfOperation(ObjOperation ... arrOperation) {
        for (ObjOperation operation : arrOperation) {
            menu.add(0, operation);
        }
    }
    public ObjOperation getObjMenuByNumber(int number) throws IndexOutOfBoundsException {
        return menu.get(number);
    }
}
