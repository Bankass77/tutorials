package certification.tutorials.basics;

import java.io.Serializable;

/**
 * 
 * The code compiles and runs without issue.
 * The name variable is transient, so it will not be saved to disk on
 * serialization. On deserialization, the JVM will call the no-arg constructor
 * of the first nonserializable parent class it can find in the class hierarchy.
 * In this case, the nonserializable Mammal constructor will run and assign the
 * value of name to Elysia
 *
 */
public class Bunny extends SerializationDeserializationObjectTest implements Serializable {
	private static final long serialVersionUID = 1L;
	{
		this.name = "Olivia";
	}

	public Bunny() {
		this.name = "Sophia";
	}

	public static void main(String[] args) {
		var b = new Bunny();
		saveToFile(b, "bunny.dat");
		b = readFromFile("bunny.dat");
		System.out.print(b.name);

	}

	private static Bunny readFromFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void saveToFile(Bunny b, String string) {
		// TODO Auto-generated method stub

	}

}
