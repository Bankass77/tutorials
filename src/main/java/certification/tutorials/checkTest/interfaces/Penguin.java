package certification.tutorials.checkTest.interfaces;

/**
 * 
 * First, if a class or interface inherits two interfaces containing default
 * methods with the same signature, it must override the method with its own
 * implementation. The Penguin class does this correctly.
 *  The way to access an inherited default method is by using the syntax Swim.super.perform()
 *  We agree that the syntax is bizarre, but you need to learn it.
 *
 */
public class Penguin implements Swim, Dance {

	/*
	 * @Override public void perform() {
	 * 
	 * Dance.super.perform(); }
	 */

	public void perform() {
		System.out.print("Smile!");
	}

	private void doShow() {
		Swim.super.perform();
	}

	public static void main(String[] eggs) {
		new Penguin().doShow();

		
	}
}
