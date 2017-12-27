package coffeegrinder;

public class EspressoGrinder extends CoffeeGrinder{
    public Double grindCoffee() throws GrinderNotCleanException {
        increaseGrindCount();
        System.out.println(toString() + " paksus: 1.0 "  + " jahvatamine nr: " + getGrindCount());
        return 0.3;
    }

    @Override
    public String toString() {
        return "Espresso";
    }
}
