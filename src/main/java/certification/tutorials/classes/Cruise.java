package certification.tutorials.classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * The readObject() method returns an Object instance, which must be explicitly
 * cast to Cruise in the second try-with-resources statement. For this reason,
 * the code does not compile. If the explicit cast were added, the code would
 * compile but throw a NotSerializableException at runtime, since Cruise does
 * not implement the Serializable interface. If both of these issues were fixed,
 * then the code would run and print 4,null. The schedule variable is marked
 * transient, so it defaults to null when deserialized, while numPassengers is
 * assigned the value it had when it was serialized. Remember that on
 * deserialization, the constructors and instance initializers are not executed.
 *
 */
public class Cruise /* implements Serializable */{
	private int numPassengers = 1;
	private transient String schedule = "NONE";
	{
		numPassengers = 2;
	}

	public Cruise() {
		this.numPassengers = 3;
		this.schedule = "Tropical Island";
	}

	public static void main(String... p) throws Exception {
		final String f = "ship.txt";
		try (var o = new ObjectOutputStream(new FileOutputStream(f))) {
			Cruise c = new Cruise();
			c.numPassengers = 4;
			c.schedule = "Casino";
			o.writeObject(c);
		}
		try (var i = new ObjectInputStream(new FileInputStream(f))) {
			Cruise c = /* (Cruise) */i.readObject();
			System.out.print(c.numPassengers + "," + c.schedule);
		}
	}

}
