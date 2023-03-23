package certification.tutorials.array;

public class ArrayDemo {

	int array[];

	int[] arrays2 = new int[2];

	public static void main(String[] args) {

		ArrayDemo arrayDemo = new ArrayDemo();

		ArrayDemo ad = new ArrayDemo();

		int another[] = { 1, 4, 3, 2 };

		/*
		 * if (arrayDemo.array ==null) {
		 * 
		 * System.out.println("Array unusable. Nothing to do"); return; }
		 * 
		 * 
		 * for (int i = 0; i < ad.array.length; ++i) { System.out.println("array [" + i+
		 * "]="+ ad.array[i] ); }
		 */
		for (int i = 0; i < another.length; i++) {
			System.out.println("another[" + another[i] + "]");
		}
	}

}
