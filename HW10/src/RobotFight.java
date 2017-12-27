import robot.FightingRobot;

public class RobotFight {
    public static void main(String[] args) {
        // Main on thread, kus sees saab teha juurde teisi threade, thread on nagu light process
        FightingRobot optimusPrime = new FightingRobot();
        optimusPrime.setName("Optimus Prime");

        System.out.println(optimusPrime.robotInfo());

        optimusPrime.getRobotEngine().changeSpeed(10);
    }
}
