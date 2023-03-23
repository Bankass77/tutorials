package certification.tutorials.basics;

public class ArithOperator {

	public static void main(String[] args) {

		int num = 120;
		double realNum = 25.5F;
		double garbage = 0.0 / 0.0;
		double veryBigNum = 25.8 / 0.0;
		boolean test = true;
		// print the value of num
		System.out.println("num = " + num);

		// print the value of realNum
		System.out.println("realNum = " + realNum);
		// print the value of veryBigNum
		System.out.println("veriBigNum= " + veryBigNum);
		// print the value of garbage
		System.out.println("garbage = " + garbage);

		// print the value of test
		System.out.println("test = " + test);

		// Print the maximum value of int type
		System.out.println("Maximum int = " + Integer.MAX_VALUE);
		// Print the maximum value of double type
		System.out.println("Maximum double = " + Double.MAX_VALUE);

		// Rule #1

		double d1 = 0.0;
		double d2 = -0.0;
		boolean b = (d1 == d2);
		System.out.println("b= " + b);
		// Rule #2

		double d3 = Double.POSITIVE_INFINITY;
		double d4 = Double.NEGATIVE_INFINITY;
		boolean b2 = (d3 == d4);
		System.out.println("comapre positif and negatif infinity b2 = " + b2);

		// Rule #3
		double d5 = Double.NaN;
		double d6 = 5.5;

		boolean b3 = (d5 == d6);
		System.out.println("an operand is NaN =  " + b3);

		// test if double or float is NaN, use isNaN() method
		boolean b4 = Double.isNaN(d5);
		System.out.println("b4 is NaN : " + b4);

		// test if double or float is infinity, use isNaN() method
		boolean b5 = Double.isFinite(d4);
		System.out.println("b4 is infinity : " + b5);
	}

}
