package certification.tutorials.recursion;

public class testRecursion {

	public static void main(String[] args) {

		int x = add(9);
		System.out.println(x);

	}

	private static int add(int number) {

		return add(number + 1);
	}

}
