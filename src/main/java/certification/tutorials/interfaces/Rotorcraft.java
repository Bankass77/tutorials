package certification.tutorials.interfaces;

/**
 * 
 * The Rotorcraft class includes an abstract method, but the class itself is not
 * marked abstract. Only interfaces and abstract classes can include abstract
 * methods
 *
 */
public class Rotorcraft {
	protected final int height = 5;

	abstract int fly();

}

interface CanFly {
}
