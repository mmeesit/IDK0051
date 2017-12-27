package bankcard;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by ets on 20.09.17.
 */
public class CreditCard extends DebitCard {
    private final BigDecimal creditLimit = new BigDecimal(-900.00);

    CreditCard() {
        super();
    }

    CreditCard(BigDecimal accountBalance) {
        setBalance(accountBalance);
    }


    public static CreditCard newCreditCard() {
        return new CreditCard();
    }

    public static CreditCard newCreditCardBalanced(BigDecimal accountBalance) {
        return new CreditCard(accountBalance);
    }


    @Override
    public void makePayment(BigDecimal paymentAmount) {
        if (remainingCredit().compareTo(paymentAmount) >= 0) {
            super.substractBalance(paymentAmount);
            System.out.println(toString() + paymentAmount);
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
