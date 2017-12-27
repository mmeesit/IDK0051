package client;

import bankcard.CreditCard;
import bankcard.DebitCard;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ets on 27.09.17.
 */
public class BankClientGateway {
    private static Map<Long, Client> clients = new HashMap<>();

    public static Client getClientByIdAndBirthdate(long clientId, String birthDate) {
        if (!clients.containsKey(clientId)) {
            Client client = buildClientWithCards(clientId, birthDate);
            clients.put(clientId, client);
        }
        return clients.get(clientId);
    }

    private static Client buildClientWithCards(long clientId, String birthDate) {
        Client client;
        LocalDate clientBirthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("d.MM.yyyy"));
        int clientAge = Period.between(clientBirthDate, LocalDate.now()).getYears();

        if (String.valueOf(clientId).length() < 4) {
            throw new IllegalArgumentException("Kliendi id kood on liiga lühike!");
        }

        if (clientAge > 17) {
            client = new Client(clientId, birthDate);
        } else {
            client = new JuniorClient(clientId, birthDate);
        }

        DebitCard debitCard = DebitCard.newDebitCardWithBalance(new BigDecimal(800.00));

        if (clientId % 2 != 0) {
            client.setCreditCard(CreditCard.newCreditCard());
            System.out.println("Klient " + clientId + " sai krediitkaardi");
        }

        if (clients.size() % 3 == 0) {
            debitCard.deposit(new BigDecimal(100.00));
        }

        client.setDebitCard(debitCard);

        return client;
    }
}
