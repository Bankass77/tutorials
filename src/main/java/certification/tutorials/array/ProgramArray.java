package certification.tutorials.array;

public class ProgramArray {
	public static void main(String[] args) {
		int a[][] = new int[3][];

		// int b[][]={{10,20,30},{40,50,60}};
		a[0] = new int[] { 6, 9, 7 };
		a[1] = new int[] { 1, 2, 3 };
		a[2] = new int[] { 4, 5 };

		System.out.println();
		System.out.println("-----------------------");
		System.out.println(a[0][0]);
		System.out.println();
		System.out.println("-----------------------");
		System.out.print(a[1][1]);
		System.out.println();
		System.out.println("-----------------------");
		System.out.println(a[1][2]);
		System.out.println();
		System.out.println("-----------------------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.println(a[2][1]);
			}

		}
	}

}
