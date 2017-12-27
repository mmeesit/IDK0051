import coffeegrinder.CoffeeGrinder;
import coffeegrinder.GrinderNotCleanException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.matchers.ThrowableCauseMatcher;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ExpectedException;

import java.util.regex.Matcher;

import static org.junit.Assert.*;

public class CoffeeGrinderTest {
    @Rule
    public ExpectedException exceptions = ExpectedException.none();

    private CoffeeGrinder coffeeGrinder;

    @Before
    public void setUp() {
        coffeeGrinder = new CoffeeGrinder();
    }

    @Test
    public void testCoffeeGrindSize() throws GrinderNotCleanException {
        double grindSize = coffeeGrinder.grindCoffee();
        assertEquals(1.0, grindSize, 1);
    }

}