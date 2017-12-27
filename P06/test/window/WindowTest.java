package window;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WindowTest {
	
	private Window window;
	
	@Before
	public void setUpTests() {
		this.window = new Window("A");
	}

	@Test
	public void testNewWindowIsClosed() {
		assertEquals(0, window.getWindowStatus());
	}
	
	@Test
	public void testOpenPartially() {
		window.openWindowPartially();
		assertEquals(2, window.getWindowStatus());
	}
	
	@Test
	public void openFully() {
		window.openWindowCompletely();
		assertEquals(10, window.getWindowStatus());
	}
	
	@Test
	public void testPartialClosing() {
		window.openWindowCompletely();
		window.closeWindowPartially();
		window.closeWindowPartially();
		assertEquals(6, window.getWindowStatus());
	}
	
	@Test
	public void testFullClosingFromFullOpen() {
		window.openWindowCompletely();
		window.closeWindowCompletely();
		assertEquals(0, window.getWindowStatus());
	}
	
	@Test
	public void testFullClosingFromPartiallyOpen() {
		window.openWindowPartially();
		window.closeWindowCompletely();
		assertEquals(0, window.getWindowStatus());
	}
	
	@Test
	public void doNotOpenOverMaxState() {
		window.openWindowCompletely();
		window.openWindowPartially();
		assertEquals(10, window.getWindowStatus());
	}
	
	@Test
	public void doNotCloseBelowMinState() {
		window.openWindowPartially();
		window.closeWindowPartially();
		window.closeWindowPartially();
		assertEquals(0, window.getWindowStatus());
	}
	
	@Test
	public void createWindowAIsOfTypeWindow() {
		Window w = Window.getFrontWindow("A");
		assertEquals(Window.class, w.getClass());
	}
	
	@Test
	public void testWindowStringRepresentation() {
		assertEquals("Aken A, avatus: 0%", window.toString());
	}
}
