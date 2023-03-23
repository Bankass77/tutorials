package certification.tutorials.basics;

public class Exercice008 {

	public static void main(String[] args) {
		int season = 3;

		String message;
		switch (season) {
		case 1:

			message = "spring";
			break;

		case 2:

			message = "Summer";
			break;

		case 3:

			message = "Fall";
			break;

		case 4:

			message = "Winter";
			break;

		default:
			message = "That' not a season";
			break;
		}
		System.out.println(message);
	}

}
