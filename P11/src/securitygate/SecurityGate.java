package securitygate;

import boardingpass.BoardingPass;
import storage.TicketStorage;

import java.util.Optional;

public class SecurityGate implements SecurityGateDatabase {
    private TicketStorage storage;

    public SecurityGate(TicketStorage storage) {
        this.storage = storage;
    }

    private void processTicket(BoardingPass boardingPass) {
        System.out.println("Registreeritud pardakaart nr " + boardingPass.getTicketCode());
    }

    private void fetchTickets() {
        // while true asendame Thread interrupted, et teeks kiiresti ära
        while (!Thread.interrupted()) {
            Optional<BoardingPass> ticket = storage.getTicket();

            /*
            if (ticket.isPresent()) {
                processTicket(ticket.get());
            }
            */

            // SECOND OPTION IS THIS FOR IF

            ticket.ifPresent(this::processTicket);
        }
    }

    @Override
    public void run() {
        fetchTickets();
    }

}
