package Operation.ListOperation.PowerCalculator;

import Operation.ObjOperation;

/**
 * Created by nimtego_loc on 21.11.2016.
 */
public class PowerCalc extends ObjOperation {
    private double power;
    private double current;
    private double voltage;


    public PowerCalc() {
        super("Power", "Test3");
        this.power = 0;
        this.current = 0;
        this.voltage = 0;
    }
    @Override
    public void menuAction() {
        LogicPowerCalc.dataCollection(this);
    }
    public void setPower(double power) {
        this.power = power;
    }
    public void setCurrent(double current) {
        this.current = current;
    }
    public void setVoltage(double voltage) {
        this.voltage = voltage > 0 ? voltage : 220;
    }
    public double getPower() {
        return power;
    }
    public double getCurrent() {
        return current;
    }
    public double getVoltage() {
        return voltage;
    }
}
