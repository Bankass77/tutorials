package certification.tutorials.classes;

/**
 * 
 * The code compiles without issue. The first print() statement refers to level
 * declared in the Deeper class, so 5 is printed. The second and third print()
 * statements actually refer to the same value in the Deep class, so 2 is
 * printed twice. The prefix Matrix. is unnecessary in the first of the two
 * print() statements and does not change the result. For these reasons
 *
 */
public class Matrix {
	private int level = 1;

	class Deep {
		private int level = 2;

		class Deeper {
			private int level = 5;

			public void printReality(int level) {
				System.out.print(this.level + " ");
				System.out.print(Matrix.Deep.this.level + " ");
				System.out.print(Deep.this.level);
			}
		}
	}

	public static void main(String[] bots) {
		Matrix.Deep.Deeper simulation = new Matrix().new Deep().new Deeper();
		simulation.printReality(6);
	}

}
