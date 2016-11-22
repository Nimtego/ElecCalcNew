package Operation.ListOperation.PowerCalculator;

import Operation.ObjOperation;
import java.util.HashMap;

/**
 * Created by nimtego_loc on 21.11.2016.
 */
public class PowerCalc extends ObjOperation {
    private HashMap<String, Double> networkSettings = new HashMap<>();

    public PowerCalc() {
        super("Power", "Test3");
        networkSettings.put("Power", 0.0);
        networkSettings.put("Current", 0.0);
        networkSettings.put("Voltage", 0.0);
    }
    @Override
    public void menuAction() {
        LogicPowerCalc.dataCollection(this);
    }
    public void setPower(double power) {
        this.networkSettings.put("Power", power > 0 ? power : 0);
    }
    public void setCurrent(double current) {
        this.networkSettings.put("Current", current > 0 ? current : 0);
    }
    public void setVoltage(double voltage) {
        this.networkSettings.put("Voltage", voltage > 0 ? voltage : 220);
    }
    public double getPower() {
        return networkSettings.get("Power");
    }
    public double getCurrent() {
        return networkSettings.get("Current");
    }
    public double getVoltage() {
        return networkSettings.get("Voltage");
    }
    public void setNetworkSettings(final HashMap<String, Double> networkSettings) {
        this.networkSettings = networkSettings;
    }
    public HashMap<String, Double> getNetworkSettings() {
        return networkSettings;
    }
    public double getByKey(String key) {
        return networkSettings.get(key);
    }
}
