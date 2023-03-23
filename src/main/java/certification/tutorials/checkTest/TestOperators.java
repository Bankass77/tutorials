package certification.tutorials.checkTest;

public class TestOperators {

	public static void main(String[] args) {
		int cookies = 4;

		double reward = 3 + 2 * --cookies;

		System.out.println("Zoo animal receives: " + reward + "  reward points");

		short height = 1, weight = 3;

		// short zebra= (byte)weight*(byte)height;
		int ticketsTaken = 1;
		int ticketsSold = 3;
		ticketsSold += 1 + ticketsTaken++;
		ticketsTaken *= 2;
		ticketsSold += (long) 1;
		System.out.println("ticketsSold :" + ticketsSold);

		System.out.println("ticketsSold :" + ticketsSold);

	}

}
