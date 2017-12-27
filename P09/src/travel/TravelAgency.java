package travel;

public class TravelAgency {
    void playWithDestinations() {
        Destination oxford = new Destination("Oxford", 280);
        Destination tartu = new Destination("Tartu", 281);
        Destination firenze = new Destination("Firenze", 305);

        System.out.println(firenze.getCelsius());
        System.out.println(tartu.getFahrenheit());

        System.out.println(oxford.getAvgWeather(t -> t - 273.15));
        System.out.println(oxford.getAvgWeather(TravelAgency::getCelsius));

    }

    public static double getCelsius(double tempKelvin) {
        return tempKelvin - 273.15;
    }

    public static void main(String[] args) {
        new TravelAgency().playWithDestinations();
    }
}
