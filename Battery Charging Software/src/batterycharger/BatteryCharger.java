package batterycharger;

public interface BatteryCharger {
    public int normalCharging();
    public void stopNormalCharging();
    public int fastCharging();
    public void stopFastCharging();
    public int electricityUsageByNormalCharging(int capacity);
    public int electricityUsageByFastCharging(int capacity);
}
