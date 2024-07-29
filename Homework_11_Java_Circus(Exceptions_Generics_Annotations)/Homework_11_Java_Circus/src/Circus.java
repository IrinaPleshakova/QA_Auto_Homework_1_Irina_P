import java.util.ArrayList;
import java.util.List;

public class Circus<T> {
	private List<T> performers;

	public Circus() {
		performers = new ArrayList<>();
	}

	public void addPerformer(T performer) {
		performers.add(performer);
	}

	public T removePerformer(T performer) {
		if (performers.remove(performer)) {
			return performer;
		} else {
			return null;
		}
	}

	public List<T> listPerformers() {
		return new ArrayList<>(performers);
	}
}
