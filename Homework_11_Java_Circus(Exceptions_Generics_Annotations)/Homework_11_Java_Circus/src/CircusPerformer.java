public class CircusPerformer {
	private String name;
	private String act;
	private int experience;
	private String experienceMessage;

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
		return experienceMessage;
	}

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

	private void setExperience(int experience) {
		try {
			if (experience <= 0) {
				throw new InvalidExperienceException("First experience - then circus!");
			} else if (experience > 50) {
				throw new InvalidExperienceException("Time to retire!");
			} else {
				this.experience = experience;
				this.experienceMessage = experience + " years of experience.";
			}
		} catch (InvalidExperienceException e) {
			this.experienceMessage = e.getMessage();
		}
	}
}

