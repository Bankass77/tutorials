package certification.tutorials.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Line x1 does not compile because of an assignment and value mismatch. The r1
 * variable is a Runnable expression. While there is an ExecutorService.submit()
 * that takes a Runnable expression, it returns Future˂?˃, since the return type
 * is void. This type is incompatible with the Future˂Stream˃ assignment without
 * an explicit cast, leading to a compiler error. Next, line x4 does not
 * compile. The parallelStream() method is found in the Collection interface,
 * not the Stream interface. Due to these two compilation errors
 *
 */
public class SnipCode {

	public static void main(String[] args) {
		var e = Executors.newSingleThreadExecutor();
		Runnable r1 = () -> Stream.of(1, 2, 3).parallel();
		Callable r2 = () -> Stream.of(4, 5, 6).parallel();

		Future<Stream<Integer>> f1 = e.submit(r1); // x1
		Future<Stream<Integer>> f2 = e.submit(r2); // x2

		var r = Stream.of(f1.get(), f2.get()).flatMap(p -> p) // x3
				.parallelStream() // x4
				.collect(Collectors.groupingByConcurrent(i -> i % 2 == 0));
		System.out.print(r.get(false).size() + " " + r.get(true).size());

	}

}
