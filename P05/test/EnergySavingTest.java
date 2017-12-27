import coffeegrinder.CoffeeGrinder;
import coffeegrinder.EspressoGrinder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class EnergySavingTest {
    private CoffeeGrinder coffeeGrinder;
    private EspressoGrinder espressoGrinder;

    @Before
    public void setUpGrinders() {
        coffeeGrinder = new CoffeeGrinder();
        espressoGrinder = new EspressoGrinder();
    }

    @Parameterized.Parameters
    public static long[] arguments() {
        return new long[] {1, 2, 3, 4};
    }

    @Test
    public void testEnergySavingMethodArgument() {
        // coffeeGrinder.setEnergySavingTimer();
    }

    @Test
    public void testGrinderIsInEnergySavingMode() {
        assertTrue(coffeeGrinder.isSavingEnergy());
    }

    @Test
    public void testExitingEnergySavingMode() {
        coffeeGrinder.quitSavingEnergy();
        assertFalse(coffeeGrinder.isSavingEnergy());
    }

    @Test
    public void testIfGrindingQuitsEnergySavingMode() {
        //coffeeGrinder.grindCoffee();
        assertFalse(coffeeGrinder.isSavingEnergy());
    }
}
