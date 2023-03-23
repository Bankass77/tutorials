package certification.tutorials.designpatterns.singleton;

public class OrderManagerService {

	// private static final field
	private static OrderManagerService instance;

	// private Constructor
	private OrderManagerService() {
	}

	// Lazy initialization and synchronized
	public static synchronized OrderManagerService getInstance() {

		if (instance == null) {

			instance = new OrderManagerService();
		}
		return instance;
	}

	public void placeOrder() {
		System.out.println("Invoke place order method");
	}
}
