package certification.tutorials.designpatterns.singleton;

public class SingletonDemo {

	public static void main(String[] args) {

		var ordermanagerService = OrderManagerService.getInstance();
		var orderManagerService2 = OrderManagerService.getInstance();
		// It's not possible create new constructor
		// var orderManagerService= new OrderManagerService().getInstance();
		System.out.println(ordermanagerService == orderManagerService2);

	}

}
