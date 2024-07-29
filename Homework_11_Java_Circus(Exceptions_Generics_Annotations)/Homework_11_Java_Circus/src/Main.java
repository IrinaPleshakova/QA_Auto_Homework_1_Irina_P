public class Main {
	public static void main(String[] args) {
		CircusPerformer alice = new CircusPerformer("Alice", "Juggler", 5);
		CircusPerformer emma = new CircusPerformer("Emma", "Fire eater", 10);
		CircusPerformer shawn = new CircusPerformer("Shawn", "Clown", 51);
		CircusPerformer bob = new CircusPerformer("Bob", "Magician", 0);

		System.out.println("Performer 1: " + alice.getName() + ", " + alice.getAct() + ", " + alice.getExperienceMessage());
		System.out.println("Performer 2: " + emma.getName() + ", " + emma.getAct() + ", " + emma.getExperienceMessage());
		System.out.println("Performer 3: " + shawn.getName() + ", " + shawn.getAct() + ", " + shawn.getExperienceMessage());
		System.out.println("Performer 4: " + bob.getName() + ", " + bob.getAct() + ", " + bob.getExperienceMessage());
	}
}