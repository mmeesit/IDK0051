import traincontroller.NoRemainingStopsException;
import traincontroller.TrainController;
import trainstop.TrainStop;

public class TrainDemo {
    public static void main(String[] args) throws NoRemainingStopsException {
        TrainController trainController = new TrainController();

        TrainStop testStop = TrainStop.getInstanceByName("Lelle");
        TrainStop testStop2 = TrainStop.getInstanceByName("Liiva");
        TrainStop testStop3 = TrainStop.getInstanceByName("Saue");
        testStop3.setLength(65);

        trainController.setTrainStops(testStop);
        trainController.setTrainStops(testStop2);
        trainController.setTrainStops(testStop3);

        trainController.openTrainDoors();
        trainController.openTrainDoors();

        System.out.println(trainController.getNextStop());

        trainController.openTrainDoors();

        System.out.println(trainController.getNextStop());
    }
}
