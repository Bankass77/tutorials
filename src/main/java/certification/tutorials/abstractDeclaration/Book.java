package certification.tutorials.abstractDeclaration;

/**
 * 
 * The code may look complicated, but it does not compile for a simple reason.
 * The abstract read() method defined in Book cannot have a method body. Since
 * it does, the code does not compile
 *
 */
public abstract class Book {
	protected static String material = "papyrus";

	public Book() {
	}

	abstract String read() {}

	public Book(String material) {
		this.material = material;
	}

}
