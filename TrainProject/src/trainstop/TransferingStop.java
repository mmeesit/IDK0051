package trainstop;

public class TransferingStop extends TrainStop {
    TransferingStop(String name) {
        super(name);
    }

    public String getImportance() {
        return "Oluline peatus";
    }

    @Override
    public String getName() {
        return super.getName() + " - ümberistumispeatus";
    }
}
