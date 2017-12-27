package messenger;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessengerTest {

	@Test (expected=IllegalArgumentException.class)
	public void testExceptionOnInvalidArgument() {
		SimpleMessage.getInstance("Mary", "");
	}

}
