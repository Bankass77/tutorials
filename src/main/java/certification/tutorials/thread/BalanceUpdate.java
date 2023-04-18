package certification.tutorials.thread;

public class BalanceUpdate {

	// initialize balance to 100

	private static int balance = 100;

	public static void main(String[] args) {

		startBalanceUpdateThread();
		// Thread to monitor the balance value
		startBalanceMonitorThread();
	}

	public static void updateBalance() {
		// add 10 to balance
		balance += 10;

		// substract 10 to balance
		balance -= 10;
	}

	public static void monitorBalance() {
		int b = balance;
		if (b != 100) {
			System.out.println("Balance changed: " + b);

			// Exit the program
			System.exit(b);
		}
	}

	private static void startBalanceMonitorThread() {

		// start a new thread that calls the updateBalance () method in an infinite loop
		// Thread to update the balance value

		Thread t = new Thread(() -> {
			while (true) {
				monitorBalance();
			}
		});
		t.start();
	}

	private static void startBalanceUpdateThread() {

		Thread t = new Thread(() -> {

			while (true) {
				updateBalance();
			}
		});

		t.start();
	}

}
