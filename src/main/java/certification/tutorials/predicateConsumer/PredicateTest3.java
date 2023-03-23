package certification.tutorials.predicateConsumer;

import java.util.Comparator;
import java.util.function.Predicate;

public class PredicateTest3 {

	public static void main(String[] args) {
	
		Predicate<Integer> r = null;
		Predicate<Integer> x= r.negate();
		Runnable y = ()->System.out.println();
		Comparator<Integer> z = (a,b)-> a-b; 
		

	}

}
