package certification.tutorials.checkTest;

public class Reindeer extends Deer {

	public Reindeer(int age) {
		System.out.println("Reindeer");

	}

	public boolean hasHorns() {
		return true;
	}

	public static void main(String[] args) {
		Deer deer = new Reindeer(5);
		System.out.println("," + deer.hasHorns());
	}
}
