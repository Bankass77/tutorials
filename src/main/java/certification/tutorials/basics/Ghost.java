package certification.tutorials.basics;

/**
 * 
 * The name instance variable is marked final and must be assigned a value
 * exactly once when it is declared, by an instance initializer, or by a
 * constructor. The no-argument constructor calls the Ghost(String) constructor,
 * which assigns a value of "Boo" to name. The process returns and the
 * constructor assigns a value of "Casper" to name. Since name is final, it
 * cannot be assigned a value twice. The compiler detects this error, if  we comment this(null) , the code compile and display Boo. 
 *
 */
public class Ghost {
	private final String name;

	public Ghost() {
		this(null);
		this.name = "Casper";
	}

	public Ghost(String n) {
		name = "Boo";
	}

	public static void main(String[] sound) {
		var d = new Ghost("Space");
		System.out.println(d.name);
	}

}
