package Operation.ListOperation.PowerCalculator;


import Utilits.UserChoice;

/**
 * Created by nimtego_loc on 21.11.2016.
 */
class LogicPowerCalc {
    static void dataCollection(PowerCalc powerCalc) {
        System.out.println("U В ?");
        powerCalc.setVoltage(UserChoice.oneIntOfTwo(220, 380));
        System.out.println(powerCalc.getVoltage());
    }
}
