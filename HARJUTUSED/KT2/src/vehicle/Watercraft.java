package vehicle;

import java.math.BigDecimal;
import java.util.Date;

public class Watercraft implements Vehicle {
    private BigDecimal price;
    private Date firstRegistration;
    private String maker;
    private boolean sails;

    public Watercraft(String maker, BigDecimal price, Date firstRegistration, boolean sails) {
        this.maker = maker;
        this.price = price;
        this.firstRegistration = firstRegistration;
        this.sails = sails;
    }

    public boolean getSails() {
        return sails;
    }

    public void setSails(boolean sails) {
        this.sails = sails;
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
        return firstRegistration;
    }

    public void setFirstRegistration(Date firstRegistration) {
        this.firstRegistration = firstRegistration;
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
        return "Maker: " + getMaker() + ", price: " + getPrice() + ", first reg: " + getFirstRegistration()
                + ", sails: " + getSails();
    }
}
