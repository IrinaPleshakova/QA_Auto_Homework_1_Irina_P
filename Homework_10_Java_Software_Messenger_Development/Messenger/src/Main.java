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
		konrad.addContact(hanna);

		System.out.println("Hanna's contacts: ");
		for (User contact : hanna.getContacts()) {
			System.out.println(contact.getName());
		}

		System.out.println("\nBartek's contacts: ");
		for (User contact : bartek.getContacts()) {
			System.out.println(contact.getName());
		}

		System.out.println("\nKonrad's contacts: ");
		for (User contact : konrad.getContacts()) {
			System.out.println(contact.getName());
		}

		System.out.println();

		Message message1 = new Message(hanna, bartek, "Hi, Bartek! ");
		hanna.sendMessage(message1);

		Message message2 = new Message(bartek,hanna, "Hi, Hanna :) ");
		bartek.sendMessage(message2);

		Message message3 = new Message(hanna,konrad, "Hi, Konrad! ");
		hanna.sendMessage(message3);

		System.out.println("\nHanna's messages: ");
		for (Message message : hanna.getMessages()) {
			System.out.println(message.getText() + "(Status: " + message.getStatus() + ")");
		}

		System.out.println("\nBartek's messages: ");
		for (Message message : bartek.getMessages()) {
			System.out.println(message.getText() + " (Status: " + message.getStatus() + ")");
		}

		System.out.println("\nKonrad's messages: ");
		for (Message message : konrad.getMessages()) {
			System.out.println(message.getText() + " (Status: " + message.getStatus() + ")");
		}

		System.out.println("\nReading messages...");
		bartek.readMessage(message1);
		hanna.readMessage(message2);
		konrad.readMessage(message3);


		System.out.println("\nHanna's messages after reading: ");
		for (Message message : hanna.getMessages()) {
			System.out.println(message.getText() + "(Status: " + message.getStatus() + ")");
		}

		System.out.println("\nBartek's messages after reading: ");
		for (Message message : bartek.getMessages()) {
			System.out.println(message.getText() + " (Status: " + message.getStatus() + ")");
		}

		System.out.println("\nKonrad's messages after reading: ");
		for (Message message : konrad.getMessages()) {
			System.out.println(message.getText() + " (Status: " + message.getStatus() + ")");
		}

		hanna.removeContact(konrad);
		System.out.println();
		System.out.println(hanna.getName() + " removing contact: " + konrad.getName());
		System.out.println("\nHanna's contacts after removing Konrad: ");
		for (User contact : hanna.getContacts()) {
			System.out.println(contact.getName());
		}

		hanna.deleteMessage(message1);
		System.out.println();
		System.out.println(hanna.getName() + " deleting a message from: " + bartek.getName());
		System.out.println("\nHanna's messages after deleting a message: ");
		for (Message message : hanna.getMessages()) {
			System.out.println(message.getText() + " (Status: " + message.getStatus() + ")");
		}

	}
}