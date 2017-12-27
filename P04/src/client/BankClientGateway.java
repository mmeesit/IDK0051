package client;

import bankcard.CreditCard;
import bankcard.DebitCard;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ets on 27.09.17.
 */
public class BankClientGateway {
    private static Map<Long, Client> clients = new HashMap<>();

    public static Client getClientById(long clientId) {
        if (!clients.containsKey(clientId)) {
            Client client = buildClientWithCards(clientId);
            clients.put(clientId, client);
        }
        return clients.get(clientId);
    }

    private static Client buildClientWithCards(long clientId) {
        Client client = new Client(clientId);
        DebitCard debitCard = new DebitCard(new BigDecimal("800.00"));

        if (clientId % 2 != 0) {
            /* // Parem viis olemas
            CreditCard creditCard = new CreditCard();
            client.setCreditCard(creditCard);
            */
            client.setCreditCard(new CreditCard());
            System.out.println("klient " + clientId + " sai krediitkaardi");
        }

        if (clients.size() % 3 == 0) {
            debitCard.deposit(new BigDecimal("100.00"));
        }

        client.setDebitCard(debitCard);

        return client;
    }
}
