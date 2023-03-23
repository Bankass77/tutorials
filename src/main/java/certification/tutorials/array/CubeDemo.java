package certification.tutorials.array;

public class CubeDemo {

	public static void main(String[] args) {

		int[][][] intMatrix3 = new int[2][2][2];

		for (int i = 0; i < intMatrix3.length; i++) {

			for (int j = 0; j < intMatrix3[i].length; j++) {

				for (int j2 = 0; j2 < intMatrix3[i][j].length; j2++) {

					intMatrix3[i][j][j2] = i + j + j2;

					System.out.println("[" + i + ", " + j + ", " + j2 + "]");

				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
