package certification.tutorials.interfaces;

public record Boss(String name) {
	@Override
	public String toString() {
		return name.toUpperCase();
	}
}
