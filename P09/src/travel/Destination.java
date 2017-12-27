package travel;

import java.util.function.DoubleFunction;

public class Destination implements DestinationModel{
    private String name;
    private double avgTmpKelvin;

    public Destination(String name, double avgTmpKelvin) {
        this.name = name;
        this.avgTmpKelvin = avgTmpKelvin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvgTmpKelvin(double avgTmpKelvin) {
        this.avgTmpKelvin = avgTmpKelvin;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getKelvin() {
        return avgTmpKelvin;
    }

    @Override
    public double getAvgWeather(DoubleFunction<Double> tempHandler) {
        return tempHandler.apply(avgTmpKelvin);
    }

    public double getCelsius() {
        return getKelvin() - 273.15;
    }

    public double getFahrenheit() {
        return getKelvin() * 9/5 - 459.67;
    }
}
