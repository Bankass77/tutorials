package certification.tutorials.interfaces.functionaInterfaceTest;

public @FunctionalInterface interface ContractZ extends ContractX, ContractY { // Compile-time error

	@Override
	void doIt(int i); // compile-time error!

	@Override
	void doIt(double d); // compile-time error!

}
