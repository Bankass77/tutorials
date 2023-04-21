package certification.tutorials.interfaces.functionaInterfaceTest;

public class PredicateTest implements Predicate<String> {

	@Override
	public boolean test(String t) {
		return t.startsWith("A");
	}
}
