/**
 * Class representing a message in the messenger system.
 */

public class Message implements MessageInterface{

	private User sender;
	private User receiver;
	private String text;
	private MessageStatus status;

	public Message (User sender, User receiver, String text){
		this.sender = sender;
		this.receiver = receiver;
		this.text = text;
		this.status = MessageStatus.SENT;
	}

	@Override
	public User getSender() {
		return sender;
	}

	@Override
	public User getReceiver() {
		return receiver;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public MessageStatus getStatus() {
		return status;
	}

	@Override
	public void setStatus(MessageStatus status) {
		this.status = status;
	}
}
