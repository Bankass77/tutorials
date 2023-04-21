package certification.tutorials.interfaces.functionaInterfaceTest;

@FunctionalInterface
public interface Predicate<T> {

	boolean test(T t); // . Functional Method

	public static <T> boolean testPredicate(T object, Predicate<T> predicate) {
		return predicate.test(object);
	}
}
