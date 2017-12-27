package airport;

import airline.AirlineTicketService;
import securitygate.SecurityGateDatabase;
import storage.TicketStorage;

public class Airport {
    private AirlineTicketService ticketService;
    private SecurityGateDatabase securityGateDatabase;

    public static void main(String[] args) {
        TicketStorage storage = new TicketStorage();
        AirportController controller = new AirportController(storage);

        try {
            controller.runAirport();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
