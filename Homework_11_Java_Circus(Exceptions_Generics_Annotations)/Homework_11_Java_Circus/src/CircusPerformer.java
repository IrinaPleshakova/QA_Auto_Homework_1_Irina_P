/**
 * Represents a circus performer.
 */
public class CircusPerformer {
	private String name;
	private String act;
	private int experience;

	public String getName() {
		return name;
	}

	public String getAct() {
		return act;
	}

	public int getExperience() {
		return experience;
	}

	public CircusPerformer(String name, String act, int experience) {
		this.name = name;
		this.act = act;
		setExperience(experience);
	}

	/**
	 * Sets the experience of the performer.
	 */
	public void setExperience(int experience) {
		this.experience = experience;
		if (experience < 1 || experience > 50) {
			System.err.println("Invalid experience for " + name + ": " + experience + " years (should be between 1 and 50).");
		}
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %d", name, act, experience);
	}

	@RunImmediately(times = 2)
	public void printFullPerformerInfo() {
		System.out.println("Name: " + name + ", Act: " + act + ", Experience: " + experience);
	}
}
