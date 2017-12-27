package travel;

import java.util.function.DoubleFunction;

public class Destination implements DestinationModel{
    private String name;
    private String currency;
    private String currencyCode;
    // this is in USD, needs conversion
    private double gdpPerCapita;
    private double area;
    private double avgTmpKelvin;

    public Destination() {

    }

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

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setGdpPerCapita(double gdpPerCapita) {
        this.gdpPerCapita = gdpPerCapita;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public double getGdpPerCapita() {
        return gdpPerCapita;
    }

    public double getArea() {
        return area;
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

    @Override
    public String toString() {
        return getName() + ", " + getCurrency() + ", " + getCurrencyCode() + ", " + getGdpPerCapita() + ", " + getArea();
    }
}
