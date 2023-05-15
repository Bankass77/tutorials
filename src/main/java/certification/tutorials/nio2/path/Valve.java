package certification.tutorials.path;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * The class compiles and runs without issue, so option F is incorrect. The
 * class defines three variables, only one of which is serializable. The first
 * variable, chambers, is serializable, with the value 2 being written to disk
 * and then read from disk. Remember, the constructors and instance initializers
 * are not executed when a class is deserialized. The next variable, size, is
 * transient. It is discarded when it is written to disk, so it has the default
 * object value of null when read from disk. Finally, the color variable is
 * static, which means it is shared by all instances of the class. Even though
 * the value was RED when the instance was serialized, this value was not
 * written to disk, since it was not part of the instance. The constructor call
 * new Valve() between the two try-with-resources blocks sets this value to
 * BLUE, which is the value printed later in the application. For these reasons,
 * the class prints 2,null,BLUE
 *
 */
public class Valve implements Serializable {
	private int chambers = -1;
	private transient Double size = null;
	private static String color;

	public Valve() {
		this.chambers = 3;
		color = "BLUE";
	}

	public static void main(String[] love) throws Throwable {
		try (var o = new ObjectOutputStream(new FileOutputStream("scan.txt"))) {
			final Valve v = new Valve();
			v.chambers = 2;
			v.size = 10.0;
			v.color = "RED";
			o.writeObject(v);
		}
		new Valve();
		try (var i = new ObjectInputStream(new FileInputStream("scan.txt"))) {
			Valve v = (Valve) i.readObject();
			System.out.print(v.chambers + "," + v.size + "," + v.color);
		}
	}

	{
		chambers = 4;
	}

}
