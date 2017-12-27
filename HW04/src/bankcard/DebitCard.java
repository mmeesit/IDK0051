package bankcard;

import java.math.BigDecimal;

/**
 * Created by ets on 20.09.17.
 */
public class DebitCard implements BankCard {
    private BigDecimal accountBalance;

    DebitCard() {
        this.accountBalance = new BigDecimal(10000.0005);
    }

    DebitCard(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public static DebitCard newDebitCard() { return new DebitCard(); }

    public static DebitCard newDebitCardWithBalance(BigDecimal accountBalance) {
        return new DebitCard(accountBalance);
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
        System.out.println("Kontolt eemaldati summa: " + paymentAmount);
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
