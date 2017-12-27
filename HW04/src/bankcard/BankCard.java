package bankcard;

import java.math.BigDecimal;

/**
 * Created by ets on 20.09.17.
 */
public interface BankCard {
    public static final BigDecimal OFFLINE_MIN_AMOUNT = new BigDecimal("1.00");
    public static final BigDecimal OFFLINE_MAX_AMOUNT = new BigDecimal("50.00");
    public static final BigDecimal OFFLINE_MAX_TOTAL = new BigDecimal("200.00");
    public BigDecimal getAccountBalance();
    public void makePayment(BigDecimal paymentAmount);
}
