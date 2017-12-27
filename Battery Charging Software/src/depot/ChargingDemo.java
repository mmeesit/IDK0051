package depot;

import batterycharger.ACCharger;
import batterycharger.DCCharger;
import chargingcontroller.ChargingController;

public class ChargingDemo {
    public static void main(String[] args) {
        ChargingController chargingController = new ChargingController();

        ACCharger acCharger = new ACCharger();
        DCCharger dcCharger = new DCCharger();
        ACCharger acCharger1 = new ACCharger();
        DCCharger dcCharger1 = new DCCharger();
        ACCharger acCharger2 = new ACCharger();
        DCCharger dcCharger2 = new DCCharger();
        ACCharger acCharger3 = new ACCharger();
        DCCharger dcCharger3 = new DCCharger();
        ACCharger acCharger4 = new ACCharger();
        DCCharger dcCharger4 = new DCCharger();

        chargingController.addCharger(acCharger);
        chargingController.addCharger(acCharger1);
        chargingController.addCharger(acCharger2);
        chargingController.addCharger(acCharger3);
        chargingController.addCharger(acCharger4);
        chargingController.addCharger(dcCharger);
        chargingController.addCharger(dcCharger1);
        chargingController.addCharger(dcCharger2);
        chargingController.addCharger(dcCharger3);
        chargingController.addCharger(dcCharger4);

        acCharger.normalCharging();
        dcCharger.normalCharging();
        System.out.println(dcCharger.electricityUsageByFastCharging(26));
        System.out.println(acCharger.electricityUsageByFastCharging(40));
    }
}
