package certification.tutorials.thread;

public class TheadTest {
	
	
	public static void  execute() {
		
		System.out.println("Hello Java threads!");
		
	}
	
	public static void main(String[] args) {
		
		Thread myThread= new Thread(TheadTest::execute);
		myThread.start();
	}
 
}
