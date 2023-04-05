package certification.tutorials.sealed;

/**
 * 
 * Line 21 does not compile because the enum value does not provide an
 * implementation for the abstract sing() method. Line 26 does not compile
 * because a sealed class requires at least one subclass to extend. Line 10 does
 * not compile because the switch expression does not cover all possible enum
 * values. Line 29 does not compile because only the enum value should be used,
 * which should not include the enum name TreeClimber.A. 
 * 
 */
public class EnumWithSealed {

	static enum A {
		SQUIRREL {
			String sing() {
				return"chirp";
			}
		},
		CHIPMUNK;

		abstract String sing();
	}

	public static void main(String[] args) {
		EnumWithSealed.A a = EnumWithSealed.A.CHIPMUNK;
		var c= switch (a) {
		case EnumWithSealed.A.SQUIRREL-> {
			
			yield 'S';
		};
		
		System.out.println(a.sing()+ " "+c);
		
				
	}
	

}
