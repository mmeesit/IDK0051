package user;

import java.util.Arrays;
import java.util.List;

import messenger.Message;
import messenger.SimpleMessage;

public class MessageUser {
	
	private String longMessage = "longl longlongl longlongl long"
			+ "longl longlongl longlongl longlongl long"
			+ "longl longlongl longlongl longlongl long"
			+ "longl longlongl longlongl longlongl longlongl long"
			+ "longl longlongl longlongl longlongl long"; 
	
	void send() {
		List<Message> messages = Arrays.asList(
				SimpleMessage.getInstance("Mary", "hi!"),
				SimpleMessage.getInstance("John", longMessage)
		);
		
		messages.forEach(System.out::println);
		
		SimpleMessage.getInstance("Bob", "");
	}	
	
	public static void main(String[] args) {
		new MessageUser().send();
	}
}
