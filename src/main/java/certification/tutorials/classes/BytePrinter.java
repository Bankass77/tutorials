package certification.tutorials.classes;

/**
 * 
 * The call to print() on line 32 invokes the overloaded print() method on line
 * 22 because short can be widened to int. The call to print() on line 33 invokes
 * the print() method on line 13 because it is an exact match. Therefore, the
 * output is intbyte,
 *
 */
public class BytePrinter {

	public void print(byte b) {
		System.out.println("byte");
	}

	public void print(Byte b) {

		System.out.println("Byte");
	}

	public void print(int i) {
		System.out.println("int");
	}

	public static void main(String[] args) {
		var printer = new BytePrinter();

		short x = 10;
		byte y = 12;

		printer.print(x);
		printer.print(y);
	}

}
