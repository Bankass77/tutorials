package certification.tutorials.exceptions;

public class DemoException {
	// Bad Method
	static int rec(int i) {

		return (i * i);
	}

	public static void main(String... strings) {

		rec(1000);
		System.out.println("ALL DONE.");

	}

}
