package certification.tutorials.enums;

/**
 * 
 * The Bottle class includes a static nested class Ship that must be
 * instantiated in a static manner. Line w2 uses an instance of Bottle to
 * instantiate the Ship. Therefore, line w2 does not compile,
 *
 */
public class Bottle {
	public static class Ship {
		private enum Sail { // w1
			TALL {
				protected int getHeight() {
					return 100;
				}
			},
			SHORT {
				protected int getHeight() {
					return 2;
				}
			};

			protected abstract int getHeight();
		}

		public Sail getSail() {
			return Sail.TALL;
		}
	}

	public static void main(String[] stars) {
		var bottle = new Bottle();
		Ship q = bottle.new Ship(); // w2
		System.out.print(q.getSail());
	}

}
