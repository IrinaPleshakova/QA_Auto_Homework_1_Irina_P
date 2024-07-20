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

	public User(String name){
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
		public void addContact(User contact){
			contacts.add(contact);
		}

		@Override
		public void sendMessage(Message message){
			messages.add(message);
			message.getReceiver().receiveMessage(message);
			System.out.println("Message sent from " + name + " to " + message.getReceiver().getName() + ": " + message.getText());
		}

		@Override
		public void receiveMessage(Message message) {
			message.setStatus(MessageStatus.RECEIVED);
			messages.add(message);
		}

		public void readMessage(Message message) {
			message.setStatus(MessageStatus.READ);
		}

}