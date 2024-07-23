/**
 * Main class for testing the messenger functionality.
 */
public class Main {
	public static void main(String[] args) {
		User hanna = new User("Hanna");
		User bartek = new User("Bartek");
		User konrad = new User("Konrad");

		hanna.addContact(bartek);
		hanna.addContact(konrad);
		bartek.addContact(hanna);
		bartek.addContact(konrad);
		konrad.addContact(hanna);
		konrad.addContact(bartek);

		hanna.printContacts();
		bartek.printContacts();
		konrad.printContacts();

		System.out.println("\n---Sending and received messages---");

		hanna.sendMessage("Hi, Bartek!", bartek);
		bartek.sendMessage("Have a nice day, Hanna!", hanna);
		konrad.sendMessage("Hi, Hanna :)", hanna);
		hanna.sendMessage("Don't text me again, Konrad!", konrad);
		konrad.sendMessage("Hey. Let's get drunk, buddy ;)", bartek);
		System.out.println();

		hanna.printMessages();
		bartek.printMessages();
		konrad.printMessages();

		System.out.println("\nReading messages...\n");
		bartek.readAllMessages();
		hanna.readAllMessages();
		konrad.readAllMessages();

		hanna.printMessages();
		bartek.printMessages();
		konrad.printMessages();

		hanna.removeContact(konrad);
		System.out.println();
		System.out.println(hanna.getName() + " removing contact: " + konrad.getName());
		System.out.println("\nHanna's contacts after removing " + konrad.getName() + ": ");
		for (User contact : hanna.getContacts()) {
			System.out.println(contact.getName());
		}

		System.out.println("\nDeleting a message from Hanna's inbox...");
		if (!hanna.getMessages().isEmpty()) {
			for (Message message : hanna.getMessages()) {
				if (message.getSender().equals(konrad)) {
					hanna.deleteMessage(message);
					break;
				}
			}
		}

		System.out.println("\nHanna's messages after deletion: ");
		for (Message message : hanna.getMessages()) {
			System.out.println("From: " + message.getSender().getName() + "\nText: " + message.getText() +
					"\n(Status: " + message.getStatus() + ")" + "\n----------------");
		}
	}
}