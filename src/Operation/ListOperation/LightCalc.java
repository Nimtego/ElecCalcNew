package Operation.ListOperation;

import Operation.ObjMenu;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
public class LightCalc extends ObjMenu {
    private int lightFlow;
    private int lux;

    public LightCalc() {this("Light", "Test");}

    public LightCalc(final LightCalc copy) {
        this(copy.getName(), copy.getType(), copy.getLightFlow(), copy.getLux());
    }

    public LightCalc(final String name, final String type) {
        this(name, type, 0, 0);
    }
    public LightCalc(final String name, final String type, final int lightFlow, final int lux) {
        super(name, type);
        this.lightFlow = lightFlow;
        this.lux = lux;
    }
    public int getLightFlow() {
        return lightFlow;
    }
    public int getLux() {
        return lux;
    }
    @Override
    public void menuAction() {
        System.out.println("---X---");
    }
}
