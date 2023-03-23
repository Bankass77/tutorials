package certification.tutorials.basics;

public class Exercice009 {

	public static void main(String[] args) {
		int tempAdjustement = 0;
		String tatste = "way too hot";

		switch (tatste) {
		case "too cold":
			tempAdjustement += 1;

			break;

		case "way too hot":
			tempAdjustement -= 1;
			break;

		case "too hot":
			tempAdjustement -= 1;
			break;

		case "Just right":
		default:
			break;
		}

		System.out.println("Adjust tempertaure:" + tempAdjustement);
	}

}
