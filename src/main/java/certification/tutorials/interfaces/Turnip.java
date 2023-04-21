package certification.tutorials.interfaces;

/*
 * The sell() method is declared final in the Vegetable class. 
 * The Turnip class then attempts to override this method, resulting in a compilation error 
 */
public class Turnip extends Vegetable {
	public final int sell() {
		return 3;
	}

	public static void main(String[] expensive) {
		System.out.print(new Turnip().sell());
	}

}
