package airline;

import boardingpass.BoardingPass;

/**
 * Created by ets on 13.09.17.
 */
public interface AirlineTicketService {
    public boolean hasNextBoardingPass();
    public BoardingPass getNextBoardingPass();
}
