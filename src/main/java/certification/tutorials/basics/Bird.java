package certification.tutorials.basics;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 
 * Line 26 includes an unhandled checked IOException, while line 27 includes an
 * unhandled checked FileNotFoundException, making option D correct. Line 24
 * does not compile because is.readObject() must be cast to a Bird object to be
 * assigned to b. It also does not compile because it includes two unhandled
 * checked exceptions, IOException and ClassNotFoundException, making option E
 * correct. If a cast operation were added on line 27 and the main() method were
 * updated on line 25 to declare the various checked exceptions, the code would
 * compile but throw an exception at runtime since Bird does not implement
 * Serializable. Finally, if the class did implement Serializable, the program
 * would print null at runtime, as that is the default value for the transient
 * field age.
 */
public class Bird {
	private String name;
	private transient Integer age;

	public static void main(String[] args) {
		try (var is = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("birds.dat")))) {
			Bird b = is.readObject();
			System.out.println(b.age);
		}
	}
}
