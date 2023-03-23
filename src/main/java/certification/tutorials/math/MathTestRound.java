package certification.tutorials.math;

public class MathTestRound {

	public static void main(String[] args) {

		long low = Math.round(123.454);
		System.out.println("low: " + low);
		long high = Math.round(123.50);
		System.out.println("high: " + high);
		int fromFloat = Math.round(123.45f);
		System.out.println("froloat: " + fromFloat);

	}

}
