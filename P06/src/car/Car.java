package car;

import control.ControlButton;
import window.RearWindow;
import window.Window;

import java.util.Optional;

public class Car {
    private ControlButton buttonK;
    private Window windowA;
    private Window windowB;
    private Window windowC;
    private Window windowD;

    public Car(Window windowA, Window windowB, ControlButton buttonK) {
        this.windowA = windowA;
        this.windowB = windowB;
        this.buttonK = buttonK;
    }

    public Car(Window windowA, Window windowB, Window windowC, Window windowD, ControlButton buttonK) {
        this.windowA = windowA;
        this.windowB = windowB;
        this.windowC = windowC;
        this.windowD = windowD;
        this.buttonK = buttonK;
    }

    public Window getWindowA() {
        return windowA;
    }

    public Window getWindowB() {
        return windowB;
    }

    public Optional<Window> getWindowC() {
        return Optional.ofNullable(windowC);
    }

    public Optional<Window> getWindowD() {
        return Optional.ofNullable(windowD);
    }

    public void disableRearWindows() {
        buttonK.changeState();
    }

    public void enableRearWindows() {
        buttonK.changeState();
    }
}
