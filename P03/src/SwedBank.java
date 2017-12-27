import bankcard.CreditCard;
import bankcard.DebitCard;
import bankcard.SpecialCreditCard;
import processor.PaymentProcessor;

import java.math.BigDecimal;

/**
 * Created by ets on 20.09.17.
 */
public class SwedBank {
    public static void main(String[] args) {
        DebitCard studentCard = new DebitCard();
        SpecialCreditCard creditCard = new SpecialCreditCard();
        DebitCard thirdCard = new CreditCard();
        PaymentProcessor processor = new PaymentProcessor();

        // System.out.println(studentCard.getAccountBalance());
        // System.out.println(creditCard.getAccountBalance());
        // System.out.println(thirdCard.getAccountBalance());

        // creditCard.makePayment(new BigDecimal(50.50));
        // studentCard.makePayment(new BigDecimal(100.00));
        // thirdCard.makePayment(new BigDecimal(25.00));

        // processor.processPayments(Arrays.asList(new DebitCard(), new CreditCard()));

        // CreditCard creditCard1 = new CreditCard(new BigDecimal("0.00"));
        // creditCard1.makePayment(new BigDecimal("900.00"));
        // creditCard1.getAccountBalance();
        // creditCard1.makePayment(new BigDecimal(1));

        // studentCard.makeOfflinePayment(new BigDecimal("50.10"));
        // creditCard.setOfflinePermission();
        creditCard.makeOfflinePayment(new BigDecimal("50.00"));
        creditCard.makeOfflinePayment(new BigDecimal("50.00"));
        creditCard.makeOfflinePayment(new BigDecimal("50.00"));
        creditCard.makeOfflinePayment(new BigDecimal("50.00"));
        creditCard.makeOfflinePayment(new BigDecimal("50.00"));
        System.out.println(creditCard.remainingCredit());
    }
}
