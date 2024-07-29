import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class representing a user in the messenger system.
 */
public class User implements UserInterface {
	private String name;
	private Set<User> contacts = new HashSet<>();
	private List<Message> messages = new ArrayList<>();

	public User(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Set<User> getContacts() {
		return contacts;
	}

	@Override
	public List<Message> getMessages() {
		return messages;
	}

	@Override
	public void addContact(User contact) {
		contacts.add(contact);
	}

	@Override
	public void removeContact(User contact) {
		contacts.remove(contact);
	}

	@Override
	public void sendMessage(String text, User receiver) {
		Message message = new Message(this, receiver, text);
		sendMessageInternal(message);
	}

	private void sendMessageInternal(Message message) {
		System.out.println("Message sent from " + name + " to " + message.getReceiver().getName() + ": " + message.getText());
		message.getReceiver().receiveMessage(message);
	}

	@Override
	public void receiveMessage(Message message) {
		message.setStatus(MessageStatus.RECEIVED);
		messages.add(message);
		System.out.println(name + " received a new unread message from " + message.getSender().getName());
		System.out.println();
	}

	@Override
	public void deleteMessage(Message message) {
		messages.remove(message);
		System.out.println("From: " + message.getSender().getName() + "\nText: " + message.getText());
	}

	public void readMessage(Message message) {
		message.setStatus(MessageStatus.READ);
	}

	public void readAllMessages() {
		for (Message message : messages) {
			if (message.getStatus() == MessageStatus.RECEIVED) {
				readMessage(message);
			}
		}
	}

	@Override
	public void printContacts() {
		System.out.println(this.name + "'s contacts: ");
		for (User contact : contacts) {
			System.out.println(contact.getName());
		}
		System.out.println();
	}

	@Override
	public void printMessages() {
		System.out.println("---" + this.name + "'s messages: ---");
		for (Message message : messages) {
			System.out.println("From: " + message.getSender().getName() + "\nText: " + message.getText() +
					"\n(Status: " + message.getStatus() + ")" + "\n----------------");
		}
		System.out.println();
	}
}
