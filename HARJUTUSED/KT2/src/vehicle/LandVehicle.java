package vehicle;

import java.math.BigDecimal;
import java.util.Date;

public class LandVehicle implements Vehicle {
    private BigDecimal price;
    private double mileage;
    private Date registrationDate;
    private String maker;

    public LandVehicle() {

    }

    public LandVehicle(String maker, BigDecimal price, double mileage, Date registrationDate) {
        this.maker = maker;
        this.price = price;
        this.mileage = mileage;
        this.registrationDate = registrationDate;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public Date getFirstRegistration() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Maker: " + getMaker() + ", price: " + getPrice() + ", mileage: " + getMileage()
                + ", reg date: " + getFirstRegistration();
    }
}
