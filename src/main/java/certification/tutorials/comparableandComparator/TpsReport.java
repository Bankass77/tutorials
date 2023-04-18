package certification.tutorials.comparableandComparator;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * The class does not compile because the bosses.get() on line 8 throws a
 * checked InterruptedException and a checked ExecutionException, neither of
 * which is handled nor declared by the submitReports() method
 *
 */
public class TpsReport {

	public void submitReports() {
		var s = Executors.newCachedThreadPool();

		Future bosses = s.submit(() -> System.out.println("1"));

		s.shutdown();
		System.out.println(bosses.get());
		
		/*
		 * try { System.out.println(bosses.get()); } catch (InterruptedException |
		 * ExecutionException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}

	public static void main(String[] args) {
		new TpsReport().submitReports();
	}

}
