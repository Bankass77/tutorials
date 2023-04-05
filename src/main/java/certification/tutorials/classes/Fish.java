package certification.tutorials.classes;

/**
 * 
 * The code outputs B1 b3 and then throws a NullPointerException. While Java
 * will create an empty array if you pass 0 arguments to a vararg parameter,
 * passing null directly still results in the bubbles parameter being null.
 * Attempting to access an index on null results in a NullPointerException.
 *
 */
public class Fish {
	private void swim(int... bubbles) {
		System.out.print("B" + bubbles[0] + " ");
	}

	private void swim(int bubbles) {
		System.out.print("b" + bubbles + " ");
	}

	public static void main(String[] args) {
		var f = new Fish();
		f.swim(1, 2);
		f.swim(3);
		f.swim(null);
	}

}
