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

	public String getExperienceMessage() {
		if (experience < 1 || experience > 50) {
			return "Experience should be between 1 and 50 years (now " + experience + ")";
		} else {
			return experience + " years of experience.";
		}
	}

	/**
	 * Exception class for invalid experience values.
	 */
	public static class InvalidExperienceException extends Exception {
		public InvalidExperienceException(String message) {
			super(message);
		}
	}

	public CircusPerformer(String name, String act, int experience) {
		this.name = name;
		this.act = act;
		setExperience(experience);
	}

	/**
	 * Sets the experience of the performer.
	 */
	private void setExperience(int experience) {
		if (experience < 1 || experience > 50) {
			try {
				throw new InvalidExperienceException("Experience should be between 1 and 50 years (now " + experience + ")");
			} catch (InvalidExperienceException e) {
				this.experience = experience;
			}
		} else {
			this.experience = experience;
		}
	}

	@RunImmediately(times = 2)
	public void printFullPerformerInfo() {
		System.out.println("Name: " + name + ", Act: " + act + ", Experience: " + experience);
	}
}
