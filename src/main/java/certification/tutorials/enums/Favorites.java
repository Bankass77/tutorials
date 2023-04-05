package certification.tutorials.enums;

/**
 * 
 * When an enum contains only a list of values, the semicolon (;) after the list
 * is optional. When an enum contains any other members, such as a constructor
 * or variable, the semicolon is required. Since the enum list does not end with
 * a semicolon, the code does not compile
 *
 */
public class Favorites {
	enum Flavors {
	      VANILLA, CHOCOLATE, STRAWBERRY  // It compile an  out 0 1 2 if add ; after STRAWBERRY
		 static final Flavors DEFAULT = STRAWBERRY;
	   }

	public static void main(String[] args) {
		for (final var e : Flavors.values())
			System.out.print(e.ordinal() + " ");
	}
}
