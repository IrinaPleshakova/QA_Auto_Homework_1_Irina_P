/**
 * Interface representing a message in the messenger system.
 */

public interface MessageInterface {
	User getSender();
	User getReceiver();
	String getText();

	MessageStatus getStatus();
	void setStatus (MessageStatus status);
}
