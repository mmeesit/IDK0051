package batterycharger;

public class ACCharger implements BatteryCharger {
    private static final int NOMINAL_POWER = 11;
    private String chargerType = "AC";
    private boolean fastCharging = false;
    private boolean normalCharging = false;

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    public String getChargerType() {
        return chargerType;
    }

    @Override
    public int normalCharging() {
        normalCharging = !normalCharging;
        return NOMINAL_POWER;
    }

    @Override
    public void stopNormalCharging() {
        normalCharging = !normalCharging;
    }

    @Override
    public int fastCharging() {
        fastCharging = !fastCharging;
        return 22;
    }

    @Override
    public void stopFastCharging() {
        fastCharging = !fastCharging;
    }

    @Override
    public int electricityUsageByNormalCharging(int capacity) {
       return NOMINAL_POWER;
    }

    @Override
    public int electricityUsageByFastCharging(int capacity) {
        return 22;
    }

    @Override
    public String toString() {
        if (!fastCharging && !normalCharging) {
            return "Laadija tüüp: " + getChargerType() + ", laadija olek: ei lae";
        } else if (!normalCharging) {
            return "Laadija tüüp: " + getChargerType() + ", laadija olek: kiirlaadimine";
        } else {
            return "Laadija tüüp: " + getChargerType() + ", laadija olek: tavalaadimine";
        }
    }
}
