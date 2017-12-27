package window;

import control.ControlButton;

public class RearWindow extends Window {
    private ControlButton buttonK;

    public RearWindow(String name, ControlButton buttonK) {
        super(name);
        this.buttonK = buttonK;
    }

    @Override
    public void openWindowPartially() {
        if (!buttonK.isBlocked()) {
            super.openWindowPartially();
        }
    }

    @Override
    public void closeWindowPartially() {
        if (!buttonK.isBlocked()) {
            super.closeWindowPartially();
        }
    }
}
