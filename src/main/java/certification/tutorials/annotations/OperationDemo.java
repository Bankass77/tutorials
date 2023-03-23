package certification.tutorials.annotations;

public class OperationDemo {

	public static void main(String[] args) {

		Addition addition = new Addition();
		int result = addition.execute(2, 5);

		System.out.println("Result is:" + " " + result);

		Operation addOperation = (a, b) -> a + b;

		int result2 = addOperation.execute(5, 10);
		System.out.println("Lambda expression: " + result2);
	}

}
