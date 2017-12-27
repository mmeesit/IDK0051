package messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Messenger {
	
	List<Message> messages = new ArrayList<>();
	
	public void receiveMessage(Message message) {
		messages.add(message);
	}
	
	public int getNumOfMessages() {
		return messages.size();
	}
	
	public int getUnreadMessagesCount() {
		int unread = 0;
		for (Message message : messages) {
			if (message.getStatus().equals(MessageStatus.UNREAD)) {
				unread++;
			}
		}
		return unread;
	}
	
	public long getUnreadMessagesCountStreamed() {
		return messages.stream()
				.filter(m -> m.getStatus().equals(MessageStatus.UNREAD))
				.count();
	}
	
	public List<Message> getAllMessages() {
		return messages;
	}
	
	public Optional<Message> getUnreadMessage() {
		for (Message message : messages) {
			if (message.getStatus().equals(MessageStatus.UNREAD)) {
				message.markAsRead();
				return Optional.of(message);
			}
		}
		return Optional.empty();
	}
	
}
