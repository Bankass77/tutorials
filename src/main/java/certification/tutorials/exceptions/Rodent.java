package certification.tutorials.exceptions;

/**
 * 
 * The code doesn’t compile. The first compilation
 * error is on line 29. Since Rodent declares at least one constructor and it is
 * not a no-argument constructor, Beaver must declare a constructor with an
 * explicit call to a super() constructor. Line 31 contains two compilation
 * errors. First, the return types are not covariant since Number is a
 * supertype, not a subtype, of Integer. Second, the inherited method is static,
 * but the overridden method is not, making this an invalid override. The code
 * contains three compilation errors
 *
 */
public class Rodent {

	public Rodent(Integer x) {

	}

	protected static Integer chew() throws Exception {

		System.out.println("Rodent is chewing");
		return 1;
	}

}

class Beaver extends Rodent {

	public Number chew() throws RuntimeException {

		System.out.println("Beaver is chewing on wood");
		return 2;
	}
}
