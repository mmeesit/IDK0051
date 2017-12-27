package airport;

import airline.AirlineTicketService;
import airline.JetBlueTicketService;
import securitygate.SecurityGate;
import securitygate.SecurityGateDatabase;
import storage.TicketStorage;

public class AirportController {
    private AirlineTicketService ticketService;
    private SecurityGateDatabase securityGateDatabase;
    private TicketStorage storage;

    public AirportController(TicketStorage storage) {
        this.storage = storage;
    }

    public void runAirport() throws InterruptedException {
        AirlineTicketService ticketService = new JetBlueTicketService(storage);
        Thread jetblueRunner = new Thread(ticketService);
        jetblueRunner.start();

        Thread jetblueRunner2 = new Thread(ticketService);
        jetblueRunner2.start();

        SecurityGateDatabase gate1 = new SecurityGate(storage);
        SecurityGateDatabase gate2 = new SecurityGate(storage);

        Thread gateRunner1 = new Thread(gate1);
        Thread gateRunner2 = new Thread(gate2);

        gateRunner1.start();
        gateRunner2.start();
        // sama trikk mis kodutöös

        Thread.sleep(7_000);

        gateRunner1.interrupt();
        gateRunner2.interrupt();

        //SecurityGateDatabase securityGate = new SecurityGate();
    }
}
