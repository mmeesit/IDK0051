import coffeegrinder.CoffeeGrinder;
import coffeegrinder.GrinderNotCleanException;

public class Jura {
    public static void main(String[] args) throws GrinderNotCleanException {
        CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
        coffeeGrinder.grindCoffee();
    }
}
