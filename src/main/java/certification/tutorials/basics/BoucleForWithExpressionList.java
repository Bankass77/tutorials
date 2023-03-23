package certification.tutorials.basics;

public class BoucleForWithExpressionList {

	public static void main(String[] args) {

		for (int num = 1; num <= 10; System.out.println(num), num++)
			;

		System.out.println("--------------------------------------");
		// You can rewrite the previous for-loop statement as follows to make it more
		// compact and accomplish
		// same task:

		for (int num = 1; num <= 10; System.out.println(num++))
			;

		System.out.println("--------------------------------------");
		for (int num = 1; num <= 10; System.out.println(++num))
			;
	}

}
