package bankcard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ets on 27.09.17.
 */
public class SpecialCreditCard extends CreditCard {
    private List<BigDecimal> offlinePayments = new ArrayList();

    public SpecialCreditCard() {
        super();
    }

    public void makeOfflinePayment(BigDecimal paymentAmount) {
        if (paymentAmount.compareTo(OFFLINE_MIN_AMOUNT) >= 0 && paymentAmount.compareTo(OFFLINE_MAX_AMOUNT) <= 0) {
            offlinePayments.add(paymentAmount);
            BigDecimal offlineTotal = offlinePayments.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

            if (offlineTotal.compareTo(OFFLINE_MAX_TOTAL) >= 0) {
                paymentAmount = paymentAmount.add(new BigDecimal("3.00"));
            }

            makePayment(paymentAmount);
        } else {
            offlinePayments.remove(paymentAmount);
            throw new RuntimeException("Makse ei vasta offline-makse nõuetele.");
        }
    }
}
