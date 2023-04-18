package certification.tutorials.records;

/**
 * 
 * An accessor (or getter) in a record is defined without a get prefix. For this
 * reason, the declaration of getFirstName() is invalid because it includes
 * an @Override annotation and there is no such method inherited. Since the code
 * does not compile. For the exam, you don’t need to know how to create
 * annotations but you need to know when the common ones are incorrectly used.
 * If the annotation were removed, then the code would print null at runtime.
 *
 */
public record Passenger(String firstName, String lastName) {
	static String middleName;

	@Override
	public String toString() {
		return null;
	}

	@Override
	public String getFirstName() {
		return null;
	}

	/*
	 * @Override public String firstName() { return null; }
	 */
	public static void main(String[] args) {
		var p = new Passenger("John", "Colbert");
		System.out.println(p.getFirstName());
	}
}
