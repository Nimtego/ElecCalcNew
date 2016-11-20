package Operation.ListOperation.LightCalc;

import Operation.ObjMenu;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
public class LightCalc extends ObjMenu {
    private int lightFlow;
    private int lux;
    private int area;
	private int lenght;
	private int widht;

    public LightCalc() {
		this("Light", "Test");
	}

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
    public void setLightFlow(int lightFlow) {this.lightFlow = lightFlow;}
    public void setLux(int lux) {this.lux = lux;}
    public void setArea(int area) {this.area = area;}
    public void setLenght(int lenght) {this.lenght = lenght;}
    public void setWidht(int widht) {this.widht = widht;}
    public int getArea() {return area;}
    public int getLenght() {return lenght;}
    public int getWidht() {return widht;}
	
    @Override
    public void menuAction() {
        System.out.println("--- " +getName() +" ---");
    }
}
