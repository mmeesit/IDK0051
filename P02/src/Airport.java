import aircontroller.AirController;
import airline.AirlineTicketService;
import airline.NordicaTicketService;
import securitygate.SecurityGate;
import boardingpass.NordicaBoardingPass;
import securitygate.SecurityGateDatabase;

/**
 * Created by ets on 13.09.17.
 */
public class Airport {
    public static void main(String[] args) {
        AirlineTicketService ticketService = new NordicaTicketService();
        SecurityGateDatabase securityGate = new SecurityGate();

        AirController controller = new AirController(ticketService, securityGate);

        controller.processBoardingPasses();
    }
}
