package client;

import bankcard.CreditCard;
import bankcard.DebitCard;

import java.util.Optional;

/**
 * Created by ets on 27.09.17.
 */
public class Client {
    private long clientId;
    private DebitCard debitCard;
    private CreditCard creditCard;

    public Client(long clientId) {
        this.clientId = clientId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }

    public CreditCard getCreditCardOld() {
        return creditCard;
    }

    public Optional<CreditCard> getCreditCard() {
        // of meetod ei sobi, peab olema ofnullable, sest creditcard objekti pole alati olemas
        return Optional.ofNullable(creditCard);
    }
}
