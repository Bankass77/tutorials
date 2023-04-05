package certification.tutorials.basics;

/**
 * 
 * The 100 parameter is an int and so calls the matching int method
 * . When this method is removed, Java looks for the next most
 * specific constructor. Java prefers autoboxing to varargs, so it chooses the
 * Integer constructor. The 100L parameter is a long. Since it can't be
 * converted into a smaller type, it is autoboxed into a Long
 *
 */
public class Run {
	static void execute() {
		System.out.print("1-");
	}

	static void execute(int num) {
		System.out.print("2-");
	}

	static void execute(Integer num) {
		System.out.print("3-");
	}

	static void execute(Object num) {
		System.out.print("4-");
	}

	static void execute(int... nums) {
		System.out.print("5-");
	}

	public static void main(String[] args) {
		Run.execute(100);
		Run.execute(100L);
	}

}
