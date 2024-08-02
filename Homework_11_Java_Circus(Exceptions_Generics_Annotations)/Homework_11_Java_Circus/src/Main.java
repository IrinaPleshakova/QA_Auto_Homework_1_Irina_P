import java.util.List;

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
		ourCircus.printAllPerformers();

		List<CircusPerformer> invalidPerformers = ourCircus.getInvalidPerformers();
		if (!invalidPerformers.isEmpty()) {
			System.out.println("\nPerformers with inappropriate experience: ");
			invalidPerformers.forEach(performer ->
					System.out.println(performer.getName() + ", " + performer.getExperienceMessage()));

			System.out.println("\nPerformers with inappropriate experience will be removed:");
			invalidPerformers.forEach(performer -> {
				ourCircus.removePerformer(performer);
				System.out.println(performer.getName());
			});
		}

		System.out.println("\nPerformers in our circus after removal:");
		ourCircus.printAllPerformers();
	}
}
