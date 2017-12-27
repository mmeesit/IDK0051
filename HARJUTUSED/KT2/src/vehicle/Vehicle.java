package vehicle;

import java.math.BigDecimal;
import java.util.Date;

public interface Vehicle {
    public BigDecimal getPrice();
    public Date getFirstRegistration();
    public String getMaker();
}
