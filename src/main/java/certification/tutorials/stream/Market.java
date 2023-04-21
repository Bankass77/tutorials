package certification.tutorials.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/**
 * 
 * First, the forEach() method requires a Consumer instance. Supplier<Double> can be
 * immediately discarded because Supplier<Double> does not inherit Consumer. For
 * this same reason, option DoubleConsummer is also incorrect. DoubleConsumer does not inherit
 * from Consumer. In this manner, primitive functional interfaces cannot be used
 * in the forEach() method. Consummer seems correct, since forEach() does take a
 * Consumer instance, but it is missing a generic argument. Without the generic
 * argument, the lambda expression does not compile because the expression p˂5
 * cannot be applied to an Object. Consummer<Integer> is also close. However, a Double
 * cannot be passed to an Integer. The correct functional interface is
 * Consumer<Double>, and since that is not available
 *
 */
public class Market {
	private static void checkPrices(List<Double> prices, Consumer<Double> scanner) {
		prices.forEach(scanner);
	}

	public static void main(String[] right) {
		List<Double> prices = List.of(1.2, 6.5, 3.0);
		checkPrices(prices, p -> {
			String result = p < 5 ? "Correct" : "Too high";
			System.out.println(result);
		});
	}

}
