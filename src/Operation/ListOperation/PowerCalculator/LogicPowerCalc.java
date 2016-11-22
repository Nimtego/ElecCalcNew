package Operation.ListOperation.PowerCalculator;

import Utilits.UserChoice;
import java.util.HashMap;

/**
 * Created by nimtego_loc on 21.11.2016.
 */
class LogicPowerCalc {
    static void dataCollection(PowerCalc powerCalc) {
        showDataEntered(powerCalc);
        System.out.println("U В ?");
        powerCalc.setVoltage(UserChoice.oneIntOfTwo(220, 380));
        System.out.println(powerCalc.getVoltage());
    }
    private static void showDataEntered(PowerCalc powerCalc) {
        System.out.println("Computation of network setting");
        HashMap<String, Double> networkSetting = powerCalc.getNetworkSettings();
        boolean check = true;
        String tmp = stringBuild(networkSetting);
        do {
            for (String key : networkSetting.keySet()) {
                System.out.println("" + key + " " + networkSetting.get(key));
            }
            System.out.println(tmp);
            System.out.println(tmp.contains("Power"));
            check = false;
        }
        while (check);
    }
    private static String stringBuild(HashMap<String, Double> forBuildString) {
        StringBuilder builder = new StringBuilder();
        for (String key : forBuildString.keySet()) {
            builder.append(key +" ");
        }
        return builder.toString();
    }
}
