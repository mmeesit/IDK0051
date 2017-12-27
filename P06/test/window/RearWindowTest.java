package window;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import control.ControlButton;

public class RearWindowTest {
	
	private RearWindow rearWindow;
	private ControlButton buttonK;

	@Before
	public void setupTests() {
		this.buttonK = new ControlButton();
		this.rearWindow = new RearWindow("C", buttonK);
	}
	
	@Test
	public void testRearWindowOpeningBlocked() {
		buttonK.changeState();
		rearWindow.openWindowPartially();
		assertEquals(0, rearWindow.getWindowStatus());
	}
	
	@Test
	public void testRearWindowClosesWhenBlocked() {
		rearWindow.openWindowPartially();
		buttonK.changeState();
		rearWindow.closeWindowCompletely();
		assertEquals(0, rearWindow.getWindowStatus());
	}
	
	@Test
	public void testRearWindowDoesNotOpenFullyWhenBlocked() {
		buttonK.changeState();
		rearWindow.openWindowCompletely();
		assertEquals(0, rearWindow.getWindowStatus());
	}
	
	@Test
	public void createWindowAIsOfTypeRearWindow() {
		Window w = Window.getRearWindow("C", buttonK);
		assertEquals(RearWindow.class, w.getClass());
	}
}
