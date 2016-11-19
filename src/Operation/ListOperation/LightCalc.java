package Operation.ListOperation;

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
	
	public class LightCalcBuilder {
		private LightCalcBuilder() {}
		
		public LightCalcBuilder setLightFlow(final int lightFlow) {
			LightCalc.this.lightFlow = lightFlow;
			return this;
		}
		
		public LightCalcBuilder setLux(final int lux) {
			LightCalc.this.lux = lightFlow;
			return this;
		}
		
		public LightCalcBuilder setArea(final int area) {
			LightCalc.this.area = area;
			return this;
		}
		
		public LightCalcBuilder setLenght(final int lenght) {
			LightCalc.this.lenght = lenght;
			return this;
		}
		
		public LightCalcBuilder setWidht(final int widht) {
			LightCalc.this.widht = widht;
			return this;
		}
		
		public LightCalc build() {
			return LightCalc.this;
		}
	}

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
	
    @Override
    public void menuAction() {
        System.out.println("---X---");
    }
	
	public static LightCalcBuilder newLightCalcBuilder() {
		return new LightCalc.new LightCalcBuilder();
	}
}
