package certification.tutorials;

/**
 * 
 * The Reindeer object is instantiated using the constructor that takes an int
 * value. Since there is no explicit call to the parent constructor, the
 * compiler inserts super() as the first line of the constructor on line 16. The
 * parent constructor is called, and Deer is printed on line 4 . The flow returns
 * to the constructor on line 16, with Reindeer being printed. Next, the
 * hasHorns() method is called. The reference type is Deer, and the underlying
 * object type is Reindeer. Since Reindeer correctly overrides the hasHorns()
 * method, the version in Reindeer is called, with line 26 printing ,true
 *
 */
public class Reindeer extends Deer {
	public Reindeer(int age) {
		System.out.print("Reindeer");
	}

	public boolean hasHorns() {
		return true;
	}

	public static void main(String[] args) {
		Deer deer = new Reindeer(5);
		System.out.println("," + deer.hasHorns());
	}
}
