package client;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class JuniorClient extends Client {
    private Client parent;

    public JuniorClient(long clientId, String birthDate) {
        super(clientId, birthDate);
    }

    @Override
    public void monthlyFee() {
        BigDecimal monthlyFee;
        int clientAge = Period.between(getBirthDate(), LocalDate.now()).getYears();

        if (clientAge <= 17) {
            float feeCalc = (float) clientAge / 100;
            getDebitCard().substractBalance(new BigDecimal(feeCalc).setScale(2, BigDecimal.ROUND_HALF_DOWN));
        }
    }

    public void setParent(Client parent) {
        this.parent = parent;
    }

    public Optional<Client> getParentInfo() {
        return Optional.ofNullable(parent);
    }
}
