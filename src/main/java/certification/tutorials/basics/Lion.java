package certification.tutorials.basics;

/**
 * 
 * A String is immutable. Calling concat() returns a new String but does not
 * change the original. A StringBuilder is mutable. Calling append() adds
 * characters to the existing character sequence along with returning a
 * reference to the same object.
 *
 */
public class Lion {
	public void roar(String roar1, StringBuilder roar2) {
		roar1.concat("!!!");
		roar2.append("!!!");
	}

	public static void main(String[] args) {
		var roar1 = "roar";
		var roar2 = new StringBuilder("roar");
		new Lion().roar(roar1, roar2);
		System.out.println(roar1 + " " + roar2);
	}
}
