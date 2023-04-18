package certification.tutorials.thread.synchronizedExemple;

public class CriticalSection2 {

	public synchronized void someMethod10() {
		// Method code goes here. Only one thread can
		// execute here at a time.
	}

	public static synchronized void someMethod() {

		// Method code goes here. Only one thread can
		// execute here at a time.
	}

	public void someMethod2() {

		synchronized (this) {
			// Method code goes here. Only one thread can
			// execute here at a time.

		}
	}

	public void someMethod3() {

		// Method code goes here. Only one thread can
		// execute here at a time.
		synchronized (this) {

		}
	}

	public void someMethod4() {

		// Method code goes here. Only one thread can
		// execute here at a time.
		synchronized (this) {

		}

		// Method code goes here. Only one thread can
		// execute here at a time.
	}

	public static synchronized void someMethod20() {
		// Method code goes here. Only one thread can
		// execute here at a time.
	}

	public static void someMethod21() {
		synchronized (CriticalSection2.class) {
			// Method code goes here. Only one thread can
			// execute here at a time.
		}

	}

	public static void someMethod_22() {
		// Method code goes here. Only one thread can
		// execute here at a time.

		synchronized (CriticalSection2.class) {
			// Method code goes here. Only one thread can
			// execute here at a time.
		}

		// Method code goes here. Only one thread can
		// execute here at a time.
	}
}
