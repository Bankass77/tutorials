package certification.tutorials.string;

/**
 * 
 * Line 20 does not compile. This question is checking to see whether you are
 * paying attention to the types. numFish is an int, and 1 is an int. Therefore,
 * we use numeric addition and get 5. The problem is that we can’t store an int
 * in a String variable. Suppose line 5 said String anotherFish = numFish + 1 +
 * "";. The variable  defined on line 5 would be the string "5", and both output statements would
 * use concatenation.
 *
 */
public class Fish {

	public static void main(String[] args) {
		int numFish = 4;
		String fishType = "tuna";
		String anotherFish = numFish + 1;
		System.out.println(anotherFish + " " + fishType);
		System.out.println(numFish + " " + 1);

	}

}
