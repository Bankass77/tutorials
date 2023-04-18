package certification.tutorials.interfaces;

/**
 * 
 * Java does not allow multiple inheritance, so having one class implement two
 * interfaces that both define the same default method signature leads to a
 * compiler error, unless the class overrides the method. In this case, the
 * talk(String...) method defined in the Performance class is an overloaded
 * method, not an overridden one, because the signatures do not match.
 * Therefore, the Performance class does not compile
 *
 */
public class Performance implements Sing, Speak {

	public int talk(String... x) {

		return x.length;
	}

	public static void main(String[] args) {
		System.out.println(new Performance().talk());
	}

}
