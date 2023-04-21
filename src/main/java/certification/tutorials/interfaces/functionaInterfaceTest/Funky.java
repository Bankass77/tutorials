package certification.tutorials.interfaces.functionaInterfaceTest;

public @FunctionalInterface interface Funky {

	@Override
	int hashCode(); // From object class

	@Override
	boolean equals(Object ob); // From object class

	@Override
	String toString(); // From object class

	boolean doTheFunk(Object object); // Abstract metthod
}
