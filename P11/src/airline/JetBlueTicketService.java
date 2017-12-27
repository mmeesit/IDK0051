package airline;

import boardingpass.BoardingPass;
import boardingpass.JetBoardingPass;
import storage.TicketStorage;

public class JetBlueTicketService implements AirlineTicketService {
    private TicketStorage storage;
    private static final int MAX_TICKETS = 3700;

    public JetBlueTicketService(TicketStorage storage) {
        this.storage = storage;
    }

    private void generateTickets() {
        for (int i = 0; i < MAX_TICKETS; i++) {
            BoardingPass ticket = new JetBoardingPass("John", "Jolo", i);
            storage.addTicket(ticket);
        }
    }

    @Override
    public void run() {
        generateTickets();
    }
}
