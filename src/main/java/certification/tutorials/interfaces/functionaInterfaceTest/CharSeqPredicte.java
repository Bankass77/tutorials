package certification.tutorials.interfaces.functionaInterfaceTest;

public @FunctionalInterface interface CharSeqPredicte {
	boolean test(String str); // Abstract method
	
	default void msg(String str) {
		System.out.println(str); // Deafault method
	}

	static void info() {
		System.out.println("Testing!"); // Static method
	}
	
	
	
}
