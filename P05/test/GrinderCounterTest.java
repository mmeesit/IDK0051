import coffeegrinder.CoffeeGrinder;
import coffeegrinder.EspressoGrinder;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class GrinderCounterTest {
    private CoffeeGrinder coffeeGrinder;
    private EspressoGrinder espressoGrinder;
    private int coffeeGrindCount = 0;
    private int espressoGrindCount = 0;

    @Before
    public void setGrinders() {
        coffeeGrinder = new CoffeeGrinder();
        espressoGrinder = new EspressoGrinder();
    }

    @Test
    public void testCoffeeGrinderInitialCounter() {
        assertEquals(coffeeGrindCount, coffeeGrinder.getGrindCount());
    }

    @Test
    public void testEspressoGrinderInitialCounter() {
        assertEquals(espressoGrindCount, espressoGrinder.getGrindCount());
    }

    @Test
    public void testIfCoffeeGrindCounterIncreases() {
        for (int i = 0; i < 2; i++) {
            // coffeeGrinder.grindCoffee();
        }

        assertEquals(2, coffeeGrinder.getGrindCount());
    }

    @Test
    public void testIfEspressoGrindCounterIncreases() {
        for (int i = 0; i < 2; i++) {
            // espressoGrinder.grindCoffee();
        }

        assertEquals(2, espressoGrinder.getGrindCount());
    }
}
