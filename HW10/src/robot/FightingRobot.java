package robot;

import engine.Engine;
import engine.RobotEngine;
import strategy.DefenceStrategy;

public class FightingRobot implements Robot {
    private String name;
    private int gear;
    private RobotEngine robotEngine;

    public FightingRobot() {
        this.robotEngine = new RobotEngine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public RobotEngine getRobotEngine() {
        return robotEngine;
    }

    @Override
    public void beingAttacked(int opponentHeight, int opponentSpeed) {
        
    }

    @Override
    public void opponentRetreats(int retreatSpeed) {

    }

    @Override
    public void inDeadlock() {

    }

    @Override
    public String robotInfo() {
        return "Name: " + getName();
    }
}
