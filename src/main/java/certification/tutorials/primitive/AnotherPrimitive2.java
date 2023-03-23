package certification.tutorials.primitive;

public class AnotherPrimitive2 {

	public static void main(String[] args) {

		byte bv = 23;

		short sbv = bv;
		float maxLongF = Long.MAX_VALUE;
		System.out.println("max long=" + Long.MAX_VALUE);

		System.out.println("float max long=" + maxLongF);
		System.out.println("byte to short:" + sbv);
	}

}
