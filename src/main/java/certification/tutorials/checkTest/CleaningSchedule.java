package certification.tutorials.checkTest;

public class CleaningSchedule {

	public static void main(String[] args) {

		CLEANING: for (char stables = 'a'; stables <= 'd'; stables++) {

			for (int leaopard = 0; leaopard < 4; leaopard++) {

				if (stables == 'b' || leaopard == 2) {

					continue CLEANING;
				}
				System.out.println("Cleaning : " + stables + " , " + leaopard);

			}

		}
	}

}
