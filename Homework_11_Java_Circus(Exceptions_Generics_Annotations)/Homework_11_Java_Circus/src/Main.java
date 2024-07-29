/**
 * Main class to demonstrate the Circus and CircusPerformer functionality.
 */
public class Main {
	public static void main(String[] args) {
		Circus<CircusPerformer> circus = new Circus<>();
		circus.addPerformer(new CircusPerformer("Alice", "Juggler", 5));
		circus.addPerformer(new CircusPerformer("Emma", "Fire eater", 10));
		circus.addPerformer(new CircusPerformer("Shawn", "Clown", 51));
		circus.addPerformer(new CircusPerformer("Bob", "Magician", 0));

		circus.saveToFile("circusPerformers.txt");

		Circus<CircusPerformer> ourCircus = new Circus<>();
		ourCircus.loadFromFile("circusPerformers.txt");

		System.out.println("Performers in our circus:");
		for (CircusPerformer performer : ourCircus.listPerformers()) {
			System.out.println(performer.getName() + ", " + performer.getAct() + ", " + performer.getExperienceMessage());
		}

		CircusPerformer performerToRemove = ourCircus.getPerformerByName("Shawn");
		if (performerToRemove != null) {
			CircusPerformer removedPerformer = ourCircus.removePerformer(performerToRemove);
			System.out.println("\nRemoved performer: " + removedPerformer.getName());
		} else {
			System.out.println("\nPerformer not found.");
		}

		System.out.println("Performers in our circus after removal:");
		for (CircusPerformer performer : ourCircus.listPerformers()) {
			System.out.println(performer.getName() + ", " + performer.getAct() + ", " + performer.getExperienceMessage());
		}
	}
}
