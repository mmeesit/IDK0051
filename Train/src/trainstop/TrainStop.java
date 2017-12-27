package trainstop;

public class TrainStop {
    private String importance = "Tavaline peatus";
    private String name;
    private int length;
    private int avgDailyClients;

    TrainStop(String name) {
        this.name = name;
    }

    public String getImportance() {
        if (avgDailyClients > 25) {
            importance = "Oluline peatus";
        }

        return importance;
    }

    public String getName() {
        return name;
    }

    public int getAvgDailyClients() {
        return avgDailyClients;
    }

    public int getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setAvgDailyClients(int avgDailyClients) {
        this.avgDailyClients = avgDailyClients;
    }

    public static TrainStop trainStopTypeByName(String name) {
        if (name.equals("Lelle") || name.equals("Haapsalu") || name.equals("Tartu") || name.equals("Tapa")) {
            return new TransferStop(name);
        } else {
            return new TrainStop(name);
        }
    }

    @Override
    public String toString() {
        return "Peatuse nimi: " + getName() + ", olulisus: " + getImportance()
                + ", keskmine reisijate arv: " + getAvgDailyClients();
    }
}
