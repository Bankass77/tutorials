package certification.tutorials.enums;

/**
 * 
 * Line 23 does not compile because the enum value does not provide an
 * implementation for the abstract sing() method. Line 28 does not compile
 * because a sealed class requires at least one subclass to extend. Line 10 does
 * not compile because the switch expression does not cover all possible enum
 * values. Line 34 does not compile because only the enum value should be used,
 * which should not include the enum name TreeClimber.A. Since four lines of
 * code do not compile,
 *
 */
public class TreeClimber {

	static enum A {
		SQUIRREL {
			String sing() {
				return "chirp";
			}

		},
		CHIPMUNK;

		abstract String sing();
	}

	public sealed class ParkFriend {

		public static void main(String[] args) {
			TreeClimber.A a = TreeClimber.A.CHIPMUNK;
			var c = switch (a) {

			case TreeClimber.A.SQUIRREL -> {
				yield 'S';
			}
			};
			System.out.print(a.sing() + " " + c);
		}
	}

}
