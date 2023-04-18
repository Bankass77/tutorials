package certification.tutorials.basics;

/**
 * 
 * The main() method defines a local class Oak that correctly extends Tree, a
 * static nested class. The method getWater() is not permitted to read the local
 * variable water, though, since it is not final or effectively final, If the
 * last line of the method were removed, then the program would compile and
 * print 8
 *
 */
public class Woods {
	static class Tree {
	}

	public static void main(String[] leaves) {
		int heat = 2;
		int water = 10 - heat;
		final class Oak extends Tree { // p1
			public int getWater() {
				return water;// p2
			}
		}
		System.out.print(new Oak().getWater());
		//water = 0;
	}

}
