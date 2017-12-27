package bankcard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by ets on 20.09.17.
 */
public class CreditCard extends DebitCard {
    private final BigDecimal creditLimit = new BigDecimal("-900.00");

    public CreditCard() {
        super();
    }

    public CreditCard(BigDecimal accountBalance) {
        setBalance(accountBalance);
    }

    @Override
    public void makePayment(BigDecimal paymentAmount) {
        if (remainingCredit().compareTo(paymentAmount) >= 0) {
            System.out.println(toString() + paymentAmount);
            super.substractBalance(paymentAmount);
        } else {
            throw new RuntimeException("Krediitkaardil pole piisavalt vabu vahendeid.");
        }
    }

    public BigDecimal remainingCredit() {
        if (getAccountBalance().signum() >= 0) {
            return getAccountBalance().add(creditLimit.abs());
        } else {
            return creditLimit.abs().subtract(getAccountBalance().abs());
        }
    }

    public BigDecimal getAccountBalance(Calendar calendar) {
        return getAccountBalance();
    }


    @Override
    public String toString() {
        return "Krediitkaardi makse ";
    }
}
