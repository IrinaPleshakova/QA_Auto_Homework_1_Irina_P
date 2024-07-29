import java.util.List;
import java.util.Set;

/**
 * Interface representing a user in the messenger system.
 */
public interface UserInterface {
	String getName();
	Set<User> getContacts();
	List<Message> getMessages();

	void addContact(User contact);
	void removeContact(User contact);
	void sendMessage(String text, User receiver);
	void receiveMessage(Message message);
	void deleteMessage(Message message);
	void printContacts();
	void printMessages();
}