package trainstop;

public class TrainStop {
    private String name;
    private int length;
    private int avgDailyUsers;

    TrainStop(String name) {
        this.name = name;
    }

    public static TrainStop getInstanceByName(String name) {
        if (name.equals("Lelle") || name.equals("Tapa") || name.equals("Tartu")
                || name.equals("Haapsalu")) {
            return new TransferingStop(name);
        }

        return new TrainStop(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImportance() {
        if (avgDailyUsers >= 25) {
            return "oluline peatus";
        }

        return "tavaline peatus";
    }

    public void setAvgDailyUsers(int avgDailyUsers) {
        this.avgDailyUsers = avgDailyUsers;
    }

    public int getAvgDailyUsers() {
        return avgDailyUsers;
    }

    @Override
    public String toString() {
        return "Peatuse: " + getName() + ", olulisus: " + getImportance() + ", keskmine reisijate arv: "
                + getAvgDailyUsers();
    }
}
