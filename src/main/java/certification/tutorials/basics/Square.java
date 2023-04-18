package certification.tutorials.basics;

/**
 * 
 * The getEqualSides() method is not overridden on line x1, since it is private
 * in the parent class and not inherited. For this reason, line x1 compiles. On
 * the other hand, the override of getEqualSides() in Square is invalid. A
 * static method cannot override a non-static method and vice versa.
 *
 */
public class Square extends Rectangle {
	public int getEqualSides() {
		return 4;
	} // x2

	public static void main(String[] corners) {
		final Square myFigure = new Square() {
		}; // x3
		System.out.print(myFigure.getEqualSides());
	}
}