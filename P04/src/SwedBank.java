import bankcard.CreditCard;
import bankcard.DebitCard;
import bankcard.SpecialCreditCard;
import client.BankClientGateway;
import client.Client;
import processor.PaymentProcessor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ets on 20.09.17.
 */
public class SwedBank {
    public static void main(String[] args) {
        DebitCard studentCard = new DebitCard();
        SpecialCreditCard creditCard = new SpecialCreditCard();
        DebitCard thirdCard = new CreditCard();
        PaymentProcessor processor = new PaymentProcessor();

        // nii kutsume välja bankgateway!!!

        Client elmo = BankClientGateway.getClientById(15);
        Client jou = BankClientGateway.getClientById(10);
        Client nada = BankClientGateway.getClientById(5);

        List<Client> clientList = Arrays.asList(elmo, jou, nada);

        for (Client client : clientList) {
            if (client.getCreditCard().isPresent()) {
                client.getCreditCard().get().makePayment(new BigDecimal("10.00"));
            }
        }

        // processor.processPayments(Arrays.asList(new DebitCard(), new CreditCard()));
    }
}
