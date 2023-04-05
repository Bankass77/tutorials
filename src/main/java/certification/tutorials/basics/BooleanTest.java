package certification.tutorials.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * 
 * The first expression is evaluated from left to right since the operator
 * precedence of & and ^ is the same, letting us reduce it to false ^ sunday,
 * which is true, because sunday is true. In the second expression, we apply the
 * negation operator (!) first, reducing the expression to sunday && true, which
 * evaluates to true. In the last expression, both variables are true, so they
 * reduce to !(true && true), which further reduces to !true, aka false.
 *
 */
public class BooleanTest {
	
	public static void main(String[] args) {
		boolean sunny = true, raining = false, sunday = true;
		boolean goingToTheStore = sunny & raining ^ sunday;
		boolean goingToTheZoo = sunday && !raining;
		boolean stayingHome = !(goingToTheStore && goingToTheZoo);
		System.out.println(goingToTheStore + "-" + goingToTheZoo + "-" + stayingHome);
	

	}

}
