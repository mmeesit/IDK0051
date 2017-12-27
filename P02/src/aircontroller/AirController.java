package aircontroller;

import airline.AirlineTicketService;
import securitygate.SecurityGateDatabase;

/**
 * Created by ets on 13.09.17.
 */
public class AirController {
    private AirlineTicketService ticketService;
    private SecurityGateDatabase securityGate;

    public AirController(AirlineTicketService airlineTicketService,
            SecurityGateDatabase securityGate) {
                this.ticketService = airlineTicketService;
                this.securityGate = securityGate;
    }

    public void processBoardingPasses() {
        while (ticketService.hasNextBoardingPass()) {
            securityGate.registerTicket(ticketService.getNextBoardingPass());
        }
    }
}
