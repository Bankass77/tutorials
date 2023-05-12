package certification.tutorials.nio2.serializable;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Chimpanzee implements Serializable {

	private static final long serialVersionUID = 1L;

	private transient String name;
	private transient int age = 10;
	private static char type = 'C';

	{
		this.age = 14;
	}

	public Chimpanzee() {
		this.name = "Unknow";
		this.age = 12;
		this.type = 'Q';
	}

	public Chimpanzee(String name, int age, char type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public void saveToFile(List<Chimpanzee> chimpanzees, File filedata) throws IOException {

		try (var output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filedata)))) {

			for (Chimpanzee chimpanzee : chimpanzees) {

				chimpanzees.add(chimpanzee);

				output.writeObject(chimpanzee);

			}

		}
	}

	List<Chimpanzee> readFromFile(File dataFile) throws IOException, ClassNotFoundException {

		var chimpanzees = new ArrayList<Chimpanzee>();
		try (var input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {

			while (true) {

				var object = input.readObject();

				if (object instanceof Chimpanzee chimpanzee) {

					chimpanzees.add(chimpanzee);
				}

			}

		} catch (EOFException e) {

			e.getMessage();
		}
		return chimpanzees;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Chimpanzee chimpanzee = new Chimpanzee();

		var chimpanzees = new ArrayList<Chimpanzee>();
		chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));

		chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));

		File chimpanzeeDataFile = new File("chimpanzee.data");

		chimpanzee.saveToFile(chimpanzees, chimpanzeeDataFile);

		var chimpanzeeFromDisk = chimpanzee.readFromFile(chimpanzeeDataFile);
		System.out.println(chimpanzeeFromDisk);

	}
}
