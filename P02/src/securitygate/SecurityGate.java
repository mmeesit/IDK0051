package securitygate;

import boardingpass.BoardingPass;

/**
 * Created by ets on 13.09.17.
 */
public class SecurityGate implements SecurityGateDatabase {
    @Override
    public void registerTicket(BoardingPass boardingPass) throws IllegalArgumentException {
        System.out.println("Registreeritud pardakaart nr " + boardingPass.getTicketCode()
        + ": " + boardingPass.getPassengerFirstName() + " " + boardingPass.getPassengerLastName());
    }
}
