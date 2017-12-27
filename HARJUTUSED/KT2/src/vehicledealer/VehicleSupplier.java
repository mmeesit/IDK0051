package vehicledealer;

import vehicle.LandVehicle;

import java.util.function.Supplier;

public class VehicleSupplier {
    public static void main(String[] args) {
        Supplier<LandVehicle> landVehicleSupplier = () -> {
            LandVehicle p = new LandVehicle();
            p.setMaker("Jolo");

            return p;
        };
        LandVehicle landVehicle = landVehicleSupplier.get();
        System.out.println(landVehicle);
    }
}
