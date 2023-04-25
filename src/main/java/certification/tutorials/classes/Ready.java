package certification.tutorials.classes;

/**
 * 
 * The code compiles without issue. The reference r.go.first refers to the value
 * in the GetSet instance, which is 5. The r.go.second actually refers to a
 * static variable accessed via an instance reference. In this case,
 * DEFAULT_VALUE is accessible within GetSet and resolves to 10
 *
 */
public class Ready {
	protected static int first = 2;
	private static final short DEFAULT_VALUE = 10;

	private static class GetSet {
		int first = 5;
		static int second = DEFAULT_VALUE;
	}

	private GetSet go = new GetSet();

	public static void main(String[] begin) {
		Ready r = new Ready();
		System.out.print(r.go.first);
		System.out.print(", " + r.go.second);
	}

}
