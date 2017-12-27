package airline;

import boardingpass.BoardingPass;
import boardingpass.NordicaBoardingPass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ets on 13.09.17.
 */
public class NordicaTicketService implements AirlineTicketService {
    List<BoardingPass> boardingPasses = new ArrayList<>();

    public NordicaTicketService() {
        NordicaBoardingPass nordicaBoardingPass1 = new NordicaBoardingPass("Jou", "Krae");
        NordicaBoardingPass nordicaBoardingPass2 = new NordicaBoardingPass("Tere", "Tore");
        NordicaBoardingPass nordicaBoardingPass3 = new NordicaBoardingPass("Karu", "M6mmi");
        NordicaBoardingPass nordicaBoardingPass4 = new NordicaBoardingPass("Beebi", "Kiisu");
        NordicaBoardingPass nordicaBoardingPass5 = new NordicaBoardingPass("Kiisu", "Miisu");

        boardingPasses.add(nordicaBoardingPass1);
        boardingPasses.add(nordicaBoardingPass2);
        boardingPasses.add(nordicaBoardingPass3);
        boardingPasses.add(nordicaBoardingPass4);
        boardingPasses.add(nordicaBoardingPass5);
    }

    @Override
    public boolean hasNextBoardingPass() {
        return !boardingPasses.isEmpty();
    }

    @Override
    public BoardingPass getNextBoardingPass() {
        return boardingPasses.remove(0);
    }
}
