package certification.tutorials.basics;

/**
 * The Bowl record does not implement the Serializable interface; therefore, 
 * attempting to write the instance to disk, or calling readObject() using ObjectInputStream,
 *  will result in a NotSerializableException at runtime. Remember, 
 *  all instance members of a class must be serializable or marked transient for the class to properly 
 *  implement the Serializable interface and be used with Java serialization
 */

import java.io.Serializable;

record Bowl(boolean spoon) {
}

public class SerializableTest implements Serializable {
	private String name = "CocoaCookies";
	private transient int sugar = 10;
	private Bowl bowl;

	public SerializableTest() {
		super();
		this.name = "CaptainPebbles";
		this.bowl = new Bowl(true);
		sugar = 2;
	}

	{
		name = "SugarPops";
	}
	// Getters/Setters Omitted
}
