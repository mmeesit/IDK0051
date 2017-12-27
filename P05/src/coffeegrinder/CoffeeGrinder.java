package coffeegrinder;

public class CoffeeGrinder {
    private boolean savingEnergy;
    private long energySavingTime;
    private int grindCounter = 0;

    public CoffeeGrinder() {
        savingEnergy = true;
    }

    public Double grindCoffee() throws GrinderNotCleanException {
        // quitSavingEnergy();
        checkIfGrinderClean();
        increaseGrindCount();
        System.out.println(toString() + " paksus: 1.0 "  + " jahvatamine nr: " + getGrindCount());
        return 1.0;
    }

    private void checkIfGrinderClean() throws GrinderNotCleanException {
        if (grindCounter >= 3) {
            throw new GrinderNotCleanException("Cleaning is required.");
        }
    }

    public void cleanGrinder() {
        this.grindCounter = 0;
    }

    public int increaseGrindCount() {
        return grindCounter++;
    }

    public int getGrindCount() {
        return grindCounter;
    }

    @Override
    public String toString() {
        return "Kohvi";
    }

    public boolean isSavingEnergy() {
        return savingEnergy;
    }

    public void quitSavingEnergy() {
        savingEnergy = false;
    }

    public void setEnergySavingTimer(long energySavingTime) {
        if (energySavingTime > 0 && energySavingTime <= 60) {
            this.energySavingTime = energySavingTime;
        }
    }
}
