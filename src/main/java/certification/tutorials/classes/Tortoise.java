package certification.tutorials.classes;

/**
 * 
 * The init() method is accessible from the same package. The race() method is
 * available from the same package or subclasses. Since Tortoise is in the same
 * package, both methods are available
 *
 */
public class Tortoise {
	protected void race(Hare hare) {
		hare.init(); // x1
		hare.race(); // x2
		System.out.print("tortoise-");
	}

	public static void main(String[] args) {
		var tortoise = new Tortoise();
		var hare = new Hare();
		tortoise.race(hare);
	}

}
