package certification.tutorials.basics;

/**
 * 
 * The super.getWeight() method returns 3 from the variable in the parent class,
 * as polymorphism and overriding do not apply to instance variables. The
 * this.height call returns the value of the variable in the current class,
 * which is 4
 *
 */
public class Rocket extends Ship {

	public int weight = 2;
	public int height = 4;

	public void printDetails() {
		System.out.print(super.getWeight() + "," + this.height);
	}

	public static final void main(String[] fuel) {
		new Rocket().printDetails();
	}
}
