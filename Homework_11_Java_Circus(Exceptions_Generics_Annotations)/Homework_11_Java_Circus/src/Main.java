public class Main {
	public static void main(String[] args) {
		CircusPerformer alice = new CircusPerformer("Alice", "Juggler", 5);
		CircusPerformer emma = new CircusPerformer("Emma", "Fire eater", 10);
		CircusPerformer shawn = new CircusPerformer("Shawn", "Clown", 51);
		CircusPerformer bob = new CircusPerformer("Bob", "Magician", 0);

		Circus<CircusPerformer> circus = new Circus<>();
		circus.addPerformer(alice);
		circus.addPerformer(emma);
		circus.addPerformer(shawn);
		circus.addPerformer(bob);

		System.out.println("List of performers:");
		for (CircusPerformer performer : circus.listPerformers()) {
			System.out.println(performer.getName() + ", " + performer.getAct() + ", " + performer.getExperienceMessage());
		}

		CircusPerformer removedPerformer = circus.removePerformer(shawn);
		if (removedPerformer != null) {
			System.out.println("\nRemoved performer: " + removedPerformer.getName());
		} else {
			System.out.println("Performer not found.");
		}

		circus.removePerformer(shawn);
		System.out.println("\nList of performers after removing " + removedPerformer.getName() + ":");
		for (CircusPerformer performer : circus.listPerformers()) {
			System.out.println(performer.getName() + ", " + performer.getAct() + ", " + performer.getExperienceMessage());
		}
	}
}