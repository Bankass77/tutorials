package certification.tutorials.interfaces.functionaInterfaceTest;

public @FunctionalInterface interface CharSeqPredicte2 {// Compile-time error
	boolean test(String str); // Abstract method
	boolean test( StringBuilder sb);  // abstract method
	

}
