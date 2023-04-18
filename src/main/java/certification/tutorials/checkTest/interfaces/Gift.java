package certification.tutorials.checkTest.interfaces;

/**
 * 
 * The declarations of the local classes Robot and Transformer compile without
 * issue. The only compilation problem in this program is the last line of the
 * main() method. The variable name is defined inside the local class and not
 * accessible outside class declaration without a reference to the local class.
 * Due to scope, this last line of the main() method does not compile
 *
 */
public class Gift {
	public static void main(String[] matrix) {
		abstract class Robot {
		}
		class Transformer extends Robot implements Toy {
			public String name = "GiantRobot";

			public String play() {
				return "DinosaurRobot";
			} // y1
		}
		Transformer prime = new Transformer() {
			public String play() {
				return name;
			} // y2
		};
		System.out.print(prime.play() + " " + name);
	}
}
