package certification.tutorials.checkTest;

public class CandyCounter {

	static long addCandy(double fruit, float vegetables) {
		return (int) fruit + vegetables; // not compile because cast is applied to fruit only

		// return (int) (fruit+ vegetables); // it's compile
	}

	public static void main(String[] args) {

		System.out.print(addCandy((long) (int) (short) 2, (float) 4));

		short height = 1, weight = 3;
		short zebra = (byte) weight * (byte) height; // not compile
		short zebra = (short) ((byte) weight * (byte) height);// Compile
	}

}
