package securitygate;

import boardingpass.BoardingPass;

/**
 * Created by ets on 13.09.17.
 */
public interface SecurityGateDatabase {
    public void registerTicket(BoardingPass boardingPass) throws IllegalArgumentException;
}
