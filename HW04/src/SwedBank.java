import bankcard.CreditCard;
import bankcard.DebitCard;
import client.BankClientGateway;
import client.Client;
import processor.PaymentProcessor;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ets on 20.09.17.
 */
public class SwedBank {
    public static void main(String[] args) {
        DebitCard studentCard = DebitCard.newDebitCard();
        DebitCard thirdCard = CreditCard.newCreditCard();
        PaymentProcessor processor = new PaymentProcessor();

        // nii kutsume välja bankgateway!!!

        Client elmo = BankClientGateway.getClientByIdAndBirthdate(1500, "26.12.1992");
        Client jou = BankClientGateway.getClientByIdAndBirthdate(1001, "20.05.1998");
        Client nada = BankClientGateway.getClientByIdAndBirthdate(5100, "05.05.2000");

        nada.monthlyFee();
        elmo.monthlyFee();

        List<Client> clientList = Arrays.asList(elmo, jou, nada);

        for (Client client : clientList) {
            if (client.getCreditCard().isPresent()) {
                client.getCreditCard().get().makePayment(new BigDecimal("10.00"));
            }
        }

        // processor.processPayments(Arrays.asList(new DebitCard(), new CreditCard()));
    }
}
