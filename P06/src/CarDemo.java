import java.util.Arrays;
import java.util.List;
import control.ControlButton;
import window.Window;

public class CarDemo {
    public static void main(String[] args) {
        ControlButton buttonK = new ControlButton();

        List<Window> windows = Arrays.asList(
                Window.getFrontWindow("B"),
                Window.getFrontWindow("A"),
                Window.getRearWindow("C", buttonK),
                Window.getRearWindow("D", buttonK));

        for (Window window : windows) {
            window.openWindowCompletely();
            window.closeWindowPartially();
            window.closeWindowCompletely();
            buttonK.changeState();
            window.openWindowPartially();
            window.closeWindowCompletely();
            System.out.println("End of cycle");
        }

        System.out.println("Success!");
    }
}