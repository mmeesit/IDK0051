import controller.TrainStopController;
import trainstop.TrainStop;

public class TrainDemo {
    public static void main(String[] args) {
        TrainStopController trainStopController = new TrainStopController();
        TrainStop lelle = TrainStop.trainStopTypeByName("Lelle");
        lelle.setLength(59);

        trainStopController.setNextTrainStop(lelle);
    }
}
