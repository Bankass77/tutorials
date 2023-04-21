package certification.tutorials.interfaces;

/**
 * 
 * The lambda syntax is incorrect. It should be -˃, not =˃
 *
 */
public class Player {

	interface Basket {
		boolean needToAim(double angle);
	}

	static void prepare(double angle, Basket t) {
		boolean ready = t.needToAim(angle); // k1
		System.out.println(ready);
	}

	public static void main(String[] args) {
		prepare(45, d => d < 5 || d < -5); // k2
		//prepare(45, d -> d < 5 || d < -5); // k2
	}

}
