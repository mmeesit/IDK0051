package messenger;

public class MultiMediaMessage extends SimpleMessage{

	private static final String JOOP_MULTI_EMOJI = "joop/multi-emoji";

	MultiMediaMessage(String message, String sender) {
		super(message, sender);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + " :-)";
	}

	public String getContentType() {
		return JOOP_MULTI_EMOJI;
	}
}
