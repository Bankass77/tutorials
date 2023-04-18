package certification.tutorials.basics;

/**
 * 
 * The hop() method has protected access, which allows subclasses to call it,
 * making line p1 compile. Additionally, code in the same package is allowed to
 * access it, making lines p2 and p3 compile. The code compiles and runs without
 * error
 *
 */
public class HopCounter {
	public static void main(String[] args) {
		var hopper = new Grasshopper();
		hopper.move(); // p2
		hopper.hop(); // p3
	}

}
