package certification.tutorials.nio2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamAndObjectOutputTest {

	public void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException {

		try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {

			for (Gorilla gorilla : gorillas)

				out.writeObject(gorilla);
		}

	}

	List<Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
		var gorillas = new ArrayList<Gorilla>();

		try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {

			while (true) {

				var object = in.readObject();
				if (object instanceof Gorilla g) {

					gorillas.add(g);
				}
			}

		} catch (EOFException e) {
			// TODO: handle exception
		}
		return gorillas;

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		var gorillas = new ArrayList<Gorilla>();
		gorillas.add(new Gorilla("Grodd, 5, false"));
		gorillas.add(new Gorilla("Ishmael", 8, true));
		File dataFile = new File("gorilla.data");

		ObjectInputStreamAndObjectOutputTest ob = new ObjectInputStreamAndObjectOutputTest();
		ob.saveToFile(gorillas, dataFile);

		var gorillaFromDisk = ob.readFromFile(dataFile);
		System.out.println(gorillaFromDisk);

	}

}
