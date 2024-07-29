public class Main {
	public static void main(String[] args) {
		Circus<CircusPerformer> circus = new Circus<>();
		CircusPerformer alice = new CircusPerformer("Alice", "Juggler", 5);
		CircusPerformer emma = new CircusPerformer("Emma", "Fire eater", 10);
		CircusPerformer shawn = new CircusPerformer("Shawn", "Clown", 51);
		CircusPerformer bob = new CircusPerformer("Bob", "Magician", 0);

		circus.addPerformer(alice);
		circus.addPerformer(emma);
		circus.addPerformer(shawn);
		circus.addPerformer(bob);

		circus.saveToFile("circusPerformers.txt");

		Circus<CircusPerformer> ourCircus = new Circus<>();
		ourCircus.loadFromFile("circusPerformers.txt");

		System.out.println("Performers in our circus:");
		for (CircusPerformer performer : ourCircus.listPerformers()) {
			System.out.println(performer.getName() + ", " + performer.getAct() + ", " + performer.getExperienceMessage());
		}

		CircusPerformer performerToRemove = null;
		for (CircusPerformer performer : ourCircus.listPerformers()) {
			if (performer.getName().equals("Shawn")) {
				performerToRemove = performer;
				break;
			}
		}

		CircusPerformer removedPerformer = ourCircus.removePerformer(performerToRemove);
		if (removedPerformer != null) {
			System.out.println("\nRemoved performer: " + removedPerformer.getName());
		} else {
			System.out.println("Performer not found.");
		}

		System.out.println("Performers in our circus after removal:");
		for (CircusPerformer performer : ourCircus.listPerformers()) {
			System.out.println(performer.getName() + ", " + performer.getAct() + ", " + performer.getExperienceMessage());
		}
	}
}
