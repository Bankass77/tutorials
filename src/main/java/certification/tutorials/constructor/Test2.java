package certification.tutorials.constructor;

public class Test2 {

	public Test2() {

		int k = 10; // First statement
		this(K); // Second stament. A compile-time error: call to this must be first statement in
					// constructor
	}

	public Test2(int x) {

		int k = 10; // First statement

	}

}
