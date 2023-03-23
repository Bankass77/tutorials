package certification.tutorials.functionalprogramming;

public final class Math {

	private static final double DEGREES_TO_RADIAN = 0.017453292519943295;

	public static double toRadians(double angdeg) {

		return angdeg * DEGREES_TO_RADIAN;

	}

	public static void main(String[] args) {

		System.out.println(java.lang.Math.random());

		System.out.println(java.lang.Math.random());

		System.out.println(java.lang.Math.toRadians(180));
		System.out.println(java.lang.Math.toRadians(180));
	}
}
