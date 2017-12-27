package controller;

import train.TrainScreen;
import trainstop.TrainStop;

import java.util.ArrayList;
import java.util.List;

public class TrainStopController {
    private TrainStop trainStop;
    private TrainScreen trainScreen = new TrainScreen();
    private List<TrainStop> trainStops = new ArrayList<>();
    private boolean doorsOpen;

    public TrainStopController() {
    }

    public void setNextTrainStop(TrainStop trainStop) {
        this.trainStop = trainStop;
        trainStops.add(trainStop);
        trainScreen.giveInfoBasedOnTrainStop(trainStop);
    }

    public void openDoors() {
        this.doorsOpen = !doorsOpen;
        System.out.println(trainStop.getName());

        if (!doorsOpen) {
            trainStops.remove(trainStop);
        }
    }
}
