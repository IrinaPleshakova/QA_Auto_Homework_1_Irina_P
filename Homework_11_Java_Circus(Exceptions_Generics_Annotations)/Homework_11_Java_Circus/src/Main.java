import java.lang.reflect.Method;
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

		Circus<CircusPerformer> loadedCircus = new Circus<>();
		loadedCircus.loadFromFile("circusPerformers.txt");

		System.out.println("Performers in the circus:");
		loadedCircus.printAllPerformers();

		List<CircusPerformer> invalidPerformers = loadedCircus.getInvalidPerformers();
		if (!invalidPerformers.isEmpty()) {
			System.out.println("\nPerformers with inappropriate experience: ");
			invalidPerformers.forEach(performer ->
					System.out.println(performer.getName() + ", " + performer.getExperience()));

			System.out.println("\nRemoving performers with inappropriate experience:");
			invalidPerformers.forEach(performer -> {
				loadedCircus.removePerformer(performer);
				System.out.println("Removed: " + performer.getName());
			});
		}

		System.out.println("\nPerformers in the circus after removal:");
		loadedCircus.printAllPerformers();

		loadedCircus.getPerformers().forEach(performer -> {
			for (Method method : performer.getClass().getDeclaredMethods()) {
				if (method.isAnnotationPresent(RunImmediately.class)) {
					RunImmediately annotation = method.getAnnotation(RunImmediately.class);
					for (int i = 0; i < annotation.times(); i++) {
						try {
							method.invoke(performer);
						} catch (Exception e) {
							System.err.println("Failed to invoke method: " + method.getName() + " on performer: " + performer.getName());
						}
					}
				}
			}
		});
	}
}
