package certification.tutorials.thread.WqitMethodCall;

public class WaitMethodCall {

	private Object objectRef = new Object();

	public synchronized  void someMethod_1() {
		
		// The thread running here has already acquired
		// the monitor lock on the object represented by 
		// the reference this because it is a 
		// Synchronized non-static method
		
		//other statements go here
		
		while (some condition is true) {
			
			// It is ok to call the wait() method on this,
			// because the current thread possesses
			// monitor lock on  this
			
			this.wait();
		}
		// other statement go here
	}
	
	public static synchronized void  someMethod_2() {
		// The thread executing here has already acquired
		// the monitor lock on the class object represented
		// by the WaitMethodCall.class reference because it
		// is a synchronized static method
		
		
		while (some condition is true) {
			
			// it is ok to call the wait () method on
			//WaitMethodCall.class because the current
			// thread possesses monitor lock on
			// WaitMethodCall.class objecyt
			
			
			WaitMethodCall.class.wait();
		}
		
		
	}
	
	public void someMethod_3() {
		
		// other statement go her
		
		synchronized (objectRef) {
			
			
			
			// Current thread possesses monitor lock of
			//objectRef
			while (some condition is true) {
				
				
				// It is ok call the wait() method on 
				// objectRef beacause the current thread
				//possesses monitor lock on objectRef
				
				objectRef.wait();
			}
		}
	}

}
