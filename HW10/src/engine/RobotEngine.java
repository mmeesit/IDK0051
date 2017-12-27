package engine;

import java.util.logging.Logger;

public class RobotEngine implements Engine {
    private Logger logger = Logger.getLogger(RobotEngine.class.getName());
    private int speed;

    public int getSpeed() {
       return speed;
    }

    @Override
    public void changeSpeed(int speed) {
        this.speed = speed;
        logger.warning("Engine speed changed to: " + getSpeed());
    }
}
