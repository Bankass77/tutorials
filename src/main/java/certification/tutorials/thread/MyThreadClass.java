package certification.tutorials.thread;

public class MyThreadClass extends Thread {

	@Override
	public void run() {
		System.out.println("Hello Java thread!");

	}
	
	
	public static void main(String[] args) {
		
		MyThreadClass  myThreadClass = new MyThreadClass();
		myThreadClass.start();
		myThreadClass.run();
	}
}