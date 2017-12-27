package trainstop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainStopTest {
    private TrainStop trainStop;
    @Before
    public void setUp() throws Exception {
        trainStop = TrainStop.getInstanceByName("Test");
    }

    @Test
    public void testHiglyVisitedStopImportance() throws Exception {
        trainStop.setAvgDailyUsers(33);
        assertEquals("oluline peatus", trainStop.getImportance());
    }

    @Test
    public void testUnPopularStopImportance() throws Exception {
        trainStop.setAvgDailyUsers(8);
        assertEquals("tavaline peatus", trainStop.getImportance());
    }

}