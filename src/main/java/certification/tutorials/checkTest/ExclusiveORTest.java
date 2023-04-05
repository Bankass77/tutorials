package certification.tutorials.checkTest;

/**
 * 
 * This code will compile and run without issue
 *  On line 22, the expressions on the left side and right side of the
 * exclusive OR ^ both evaluate to true, and since (true ^ true) is false, the
 * first branch will not be taken. On line 24, x does equal 4, so line 25 will be
 * executed, and "Match" will be printed. Finally, since the if-then statement
 * on line 28 is not connected to the previous statements (despite the
 * indentation), it will also be executed, and "High" will be printed. 
 *  Note that this “matching
 * algorithm” is somewhat broken conceptually, because a value of x of 5 will
 * output LowHigh. The key is to focus on what the algorithm does, not whether
 * it does it well.
 *
 */
public class ExclusiveORTest {

	public static void main(String[] args) {
		var x = 4;
		if (x >= 5 ^ x == 4)
			System.out.print("Low");
		else if (x == 4)
			System.out.print("Match");
		if (x > 1)
			System.out.print("High");

	}

}
