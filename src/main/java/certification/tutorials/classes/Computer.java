package certification.tutorials.classes;

/**
 * 
 * Both objects are instances of the class Laptop. This means the overridden
 * startup() method in the Laptop class gets called both times thanks to
 * polymorphism
 *
 */
public class Computer {
	public void startup() {
		System.out.print("computer-");
	}

	public static void main(String[] args) {
		Computer computer = new Laptop();
		Laptop laptop = new Laptop();
		computer.startup();
		laptop.startup();
	}

}
