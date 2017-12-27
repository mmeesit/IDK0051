package chargingcontroller;

import batterycharger.ACCharger;
import batterycharger.BatteryCharger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChargingController {
    List<ACCharger> acChargers = new ArrayList<>();
    private String name;

    public void addCharger(ACCharger acCharger) {
        acChargers.add(acCharger);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}
