package traincontroller;

public class NoRemainingStopsException extends Exception {
    public NoRemainingStopsException(String msg) {
        super(msg);
    }
}
