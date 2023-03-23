package certification.tutorials.basics;

import certification.tutorials.checkTest.MathFunctions;

public class MatFunctions {

	public static void addToInt(int x, int amountToAdd) {

		x = x + amountToAdd;
	}

	public static void main(String[] args) {

		var x = 12;
		var a = 15;
		var b = 10;

		MathFunctions.addToInt(a, b);
		System.out.println(a);
	}

}
