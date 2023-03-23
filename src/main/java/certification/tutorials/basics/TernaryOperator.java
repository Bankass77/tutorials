package certification.tutorials.basics;

public class TernaryOperator {

	public static void main(String[] args) {

		int heigh = 200;
		int minHeight = 121;
		String result = "";

		result = (heigh > minHeight) ? "You are allowed on the ride" : "Sorry you do not meet the height requirements";
		System.out.println(result);
	}

}
