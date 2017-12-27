package robot;

public interface Robot {
    void beingAttacked(int opponentHeight, int opponentSpeed);
    void opponentRetreats(int retreatSpeed);
    void inDeadlock();
    String robotInfo();
}
