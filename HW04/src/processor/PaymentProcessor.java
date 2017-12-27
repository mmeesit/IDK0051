package processor;

import bankcard.BankCard;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ets on 20.09.17.
 */
public class PaymentProcessor {
    public void processPayments(List<BankCard> cards) {
        for (BankCard card : cards) {
            card.makePayment(new BigDecimal(3.0454547));
            System.out.println(card.getAccountBalance());
        }
    }
}
