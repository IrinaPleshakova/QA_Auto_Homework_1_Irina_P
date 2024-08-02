import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a circus with a list of performers.
 */
public class Circus<T extends CircusPerformer> {
	private List<T> performers;

	public Circus() {
		performers = new ArrayList<>();
	}

	public void addPerformer(T performer) {
		performers.add(performer);
	}

	/**
	 * Removes a performer from the circus.
	 */
	public T removePerformer(T performer) {
		if (performers != null && performers.remove(performer)) {
			return performer;
		} else {
			return null;
		}
	}

	/**
	 * Prints all performers in the circus.
	 */
	public void printAllPerformers() {
		performers.forEach(performer ->
				System.out.println(performer.getName() + ", " + performer.getAct() + ", " + performer.getExperienceMessage()));
	}

	/**
	 * Gets performers with invalid experience.
	 */
	public List<T> getInvalidPerformers() {
		return performers.stream()
				.filter(performer -> performer.getExperience() < 1 || performer.getExperience() > 50)
				.collect(Collectors.toList());
	}

	/**
	 * Saves the list of performers to a file.
	 */
	public void saveToFile(String filename) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
			for (T performer : performers) {
				writer.write(performer.getName() + ", " + performer.getAct() + ", " + performer.getExperience());
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error saving to file: " + e.getMessage());
		}
	}

	/**
	 * Loads the list of performers from a file.
	 */
	public void loadFromFile(String filename) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			performers.clear();
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(", ");
				if (parts.length == 3) {
					String name = parts[0];
					String act = parts[1];
					int experience = Integer.parseInt(parts[2]);
					addPerformer((T) new CircusPerformer(name, act, experience));
				}
			}
		} catch (IOException e) {
			System.out.println("Error loading from file: " + e.getMessage());
		}
	}
	
	public List<T> getPerformers() {
		return performers;
	}
}