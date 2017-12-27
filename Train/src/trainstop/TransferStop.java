package trainstop;

public class TransferStop extends TrainStop {
    TransferStop(String name) {
        super(name);
    }

    @Override
    public String getImportance() {
        return "Oluline peatus";
    }

    @Override
    public String getName() {
        return super.getName() + " - ümberistumispeatus";
    }
}
