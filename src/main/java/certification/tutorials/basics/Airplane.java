package certification.tutorials.basics;

/**
 * 
 * The input to the constructor is ignored, making the assignment of end to be
 * 4. Since start is 2, the subtraction of 2 from 4 results in the application
 * printing 2, followed by 5
 *
 */
public class Airplane {
	static int start = 2;
	final int end;

	public Airplane(int x) {
		x = 4;
		end = x;
	}

	public void fly(int distance) {
		System.out.print(end - start + " ");
		System.out.print(distance);
	}

	public static void main(String... start) {
		new Airplane(10).fly(5);
	}

}
