package window;

import control.ControlButton;

public class Window {
    private static final int MIN_STATE = 0;
    private static final int STATE_INCREMENT = 2;
    private static final int MAX_STATE = 10;
    private int windowStatus = 0;
    private String name;

    public Window(String name) {
        this.name = name;
    }

    public static Window getFrontWindow(String name) {
        if (name.equals("A") || name.equals("B")) {
            return new Window(name);
        }
        throw new IllegalArgumentException("Invalid name");
    }

    public static Window getRearWindow(String name, ControlButton buttonK) {
        if (name.equals("C") || name.equals("D")) {
            return new RearWindow(name, buttonK);
        }
        throw new IllegalArgumentException("Invalid name");
    }

    public void setWindowStatus(int windowStatus) {
        this.windowStatus = windowStatus;
    }

    public int getWindowStatus() {
        return windowStatus;
    }


    public void openWindowCompletely() {
        windowStatus = MAX_STATE;
    }


    public void closeWindowCompletely() {
        windowStatus = MIN_STATE;
    }


    public void openWindowPartially() {
        windowStatus += STATE_INCREMENT;
        if (windowStatus > MAX_STATE) {
            windowStatus = MAX_STATE;
        }
    }


    public void closeWindowPartially() {
        if ((windowStatus - STATE_INCREMENT) < MIN_STATE) {
            windowStatus = MIN_STATE;
        } else {
            windowStatus -= STATE_INCREMENT;
        }
    }

    @Override
    public String toString() {
        return "Aken " + this.name + ", avatus: " + this.getWindowStatus() * 10 + "%";
    }
}
