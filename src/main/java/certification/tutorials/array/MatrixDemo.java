package certification.tutorials.array;

public class MatrixDemo {

	public static void main(String[] args) {

		int intMatrix[][] = { { 1, 0 }, { 0, 1 } };

		int[][] intMatrix2 = new int[2][2];

		for (int i = 0; i < intMatrix2.length; i++) {

			for (int j = 0; j < intMatrix2[i].length; j++) {

				intMatrix2[i][j] = i + j;

				System.out.println(intMatrix[i][j] + " ");

				// System.out.println("["+i+" ,"+j+"]");
			}
			System.out.println();
		}

		//

		var twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {

			for (int j = 0; j < twoD[i].length; j++) {
				System.out.println(twoD[i][j] + " ");
				System.out.println();

			}
		}

	}

}
