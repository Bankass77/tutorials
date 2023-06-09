package certification.tutorials.sealed;

/**
 * 
 * A class extended a sealed class must be marked final, sealed, or non-sealed.
 * Since Armadillo is missing a modifier, the code does not compile
 *
 */
public sealed class ArmoredAnimal permits Armadillo {
	public ArmoredAnimal(int size) {
	}

	@Override
	public String toString() {
		return "Strong";
	}

	public static void main(String[] a) {
		var c = new Armadillo(10, null);
		System.out.println(c);
	}
}

class Armadillo extends ArmoredAnimal {
	@Override
	public String toString() {
		return "Cute";
	}

	public Armadillo(int size, String name) {
		super(size);
	}
}