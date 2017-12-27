package client;

import bankcard.CreditCard;
import bankcard.DebitCard;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * Created by ets on 27.09.17.
 */
public class Client {
    private long clientId;
    private long phoneNumber;
    private String email;
    private String name;
    private LocalDate birthDate;
    private DebitCard debitCard;
    private CreditCard creditCard;

    public Client(long clientId, String birthDate) {
        this.clientId = clientId;
        this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("d.MM.yyyy"));
    }

    public void monthlyFee() {
        this.getDebitCard().substractBalance(new BigDecimal(1.00).setScale(2, BigDecimal.ROUND_HALF_DOWN));
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public long getClientId() { return clientId; }

    public LocalDate getBirthDate() { return birthDate; }

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
