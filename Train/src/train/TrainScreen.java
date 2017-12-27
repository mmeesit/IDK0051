package train;

import trainstop.TrainStop;

public class TrainScreen {
    public void giveInfoBasedOnTrainStop(TrainStop trainStop) {
        String defaultMessage = "Järgmine peatus on: ";

        if (trainStop.getLength() < 60) {
            System.out.println(defaultMessage + trainStop.getName() + ". Väljumine ainult esimese vaguni kaudu.");
        } else System.out.println(defaultMessage + trainStop.getName());
    }
}
