package certification.tutorials.basics;

public class MathTest {

	public static void main(String[] args) {
		double one = Math.pow(1, 2);
		int two = Math.round(1.0); // assign long to int need to cast a value to int :int two = (int)
									// Math.round(1.0)
		float three = Math.random(); // Assign double to float: need to cast a value with a float: (float)
										// Math.random()
		var doubles = new double[] { one, two, three };

	}

}
