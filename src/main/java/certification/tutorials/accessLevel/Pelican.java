package certification.tutorials.accessLevel;

public class Pelican extends Bird {
	public Pelican() {
		System.out.print("Oh-");
	}

	protected void fly() {
		System.out.println("Pelican");
	}

	public static void main(String[] args) {
		var chirp = new Pelican();
		chirp.fly();
	}

}
