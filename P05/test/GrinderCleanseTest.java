import coffeegrinder.CoffeeGrinder;
import coffeegrinder.EspressoGrinder;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class GrinderCleanseTest {
    private CoffeeGrinder coffeeGrinder;
    private EspressoGrinder espressoGrinder;

    @Before
    public void setGrinders() {
        coffeeGrinder = new CoffeeGrinder();
        espressoGrinder = new EspressoGrinder();
    }
    /*


    @Test
    /*
    public void testCleanGrinderAfterThreeGrindsAndResetCounter() {
        for (int i = 0; i < 3; i++) {
            coffeeGrinder.grindCoffee();
        }
        assertEquals(0, coffeeGrinder.getGrindCount());
    }

    */
}
