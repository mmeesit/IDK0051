package bankcard;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ets on 20.09.17.
 */
public class DebitCard implements BankCard {
    private BigDecimal accountBalance;

    public DebitCard() {
        this.accountBalance = new BigDecimal(10000.0005);
    }

    public DebitCard(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    @Override
    public void makePayment(BigDecimal paymentAmount) {
        if (accountBalance.compareTo(paymentAmount) >= 0) {
            substractBalance(paymentAmount);
            System.out.println(toString() + paymentAmount);
        } else {
            throw new RuntimeException("Deebetkaardil pole piisavalt vabu vahendeid.");
        }
    }

    public void substractBalance(BigDecimal paymentAmount) {
        accountBalance = accountBalance.subtract(paymentAmount);
    }

    public void deposit(BigDecimal depositAmount) {
        accountBalance.add(depositAmount);
    }

    @Override
    public String toString() {
        return "Deebetkaardi makse ";
    }
}
