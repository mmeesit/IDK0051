package traincontroller;

import trainstop.TrainStop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainController {
    List<TrainStop> trainStops = new ArrayList<>();

    public void setTrainStops(TrainStop trainStop) {
        if (!trainStops.contains(trainStop)) {
            trainStops.add(trainStop);

            if (trainStop.getLength() < 60) {
                System.out.println("Järgmine peatus on: " + trainStop.getName() + ". Väljumine ainult esimese vaguni kaudu.");
            } else {
                System.out.println("Järgmine peatus on: " + trainStop.getName() + ".");
            }
        } else {
            System.out.println("Peatus on juba sihtkohtadesse lisatud.");
        }
    }

    public Optional<String> getNextStop() {
        return Optional.ofNullable(trainStops.get(0).getName());
    }

    public void openTrainDoors() throws NoRemainingStopsException {
        if (trainStops.isEmpty()) {
            throw new NoRemainingStopsException("Järgnev peatus puudub");
        } else {
            System.out.println("Uksed avatud. Peatus: " + trainStops.get(0).getName());
            trainStops.remove(0);
        }
    }
}
