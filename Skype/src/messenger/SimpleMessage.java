package messenger;

import java.time.LocalDateTime;

public class SimpleMessage implements Message {

	private String message;
	private String sender;
	private LocalDateTime sendTime;
	private MessageStatus read = MessageStatus.UNREAD;
	
	SimpleMessage(String message, 
			String sender) {
		this.message = message;
		this.sender = sender;
		this.sendTime = LocalDateTime.now();
	}
	
	public static Message getInstance(String sender,
			String messageContent) {
		if (messageContent.length() < 1) {
			throw new IllegalArgumentException(""
					+ "Message must have content!");
		}
		
		if (messageContent.length() <= 140) {
			return new SimpleMessage(messageContent, sender);
		}
		
		return new MultiMediaMessage(messageContent, sender);
	}
	
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String getSenderName() {
		return sender;
	}

	@Override
	public LocalDateTime getSendTime() {
		return sendTime;
	}

	@Override
	public MessageStatus getStatus() {
		return read;
	}

	@Override
	public void markAsRead() {
		this.read = MessageStatus.READ;
	}
	
	@Override
	public String toString() {
		return getMessage() + " by " + getSenderName()
				+ " at " + getSendTime();
	}

}
