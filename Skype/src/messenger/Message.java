package messenger;

import java.time.LocalDateTime;

public interface Message {
	String getMessage();
	String getSenderName();
	LocalDateTime getSendTime();
	MessageStatus getStatus();
	void markAsRead();
}
