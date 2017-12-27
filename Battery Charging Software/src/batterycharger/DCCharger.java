package batterycharger;

public class DCCharger extends ACCharger {
    private static final int FAST_CHARGING_POWER = 40;
    @Override
    public int fastCharging() {
        return 40;
    }

    @Override
    public int electricityUsageByFastCharging(int capacity) {
        if (capacity > FAST_CHARGING_POWER) {
            return FAST_CHARGING_POWER;
        } else {
            return (int) (0.8 * FAST_CHARGING_POWER);
        }
    }
}
