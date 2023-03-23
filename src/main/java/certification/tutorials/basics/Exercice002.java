package certification.tutorials.basics;

public class Exercice002 {

	public static void main(String[] args) {

		int maxDistance = 10;

		int distanceToHome = 11;

		if (distanceToHome > maxDistance) {

			System.out.println("Distance from store to your home is");
			System.out.println("more than " + maxDistance + " km away.");
			System.out.println("That is too for for free delivery.");

		}

		if (distanceToHome <= maxDistance) {
			System.out.println("Distance from store to your home is");
			System.out.println("with in " + maxDistance + " km away.");
			System.out.println("you get free delivery.");

		}

	}

}
