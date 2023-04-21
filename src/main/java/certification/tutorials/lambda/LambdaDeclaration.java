package certification.tutorials.lambda;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public interface LambdaDeclaration {

	public boolean test(Integer t);  // Target type: Integer -> boolean

	Predicate<Integer> p1 = i -> i % 2 == 0;            // Target Type: Predicate<Integer>
	Predicate<Integer> p2 = new Predicate<Integer>() {  // anonymous class

		@Override
		public boolean test(Integer i) {

			return i % 2 == 0;
		}
	};
	
	IntPredicate p3= i->i % 2 ==0;     // Target type: IntePredicate

	public static void main(String[] args) {
		
		System.out.println(p1==p2);
		
		boolean result1=p1.test(2021);
		boolean result2= p2.test(2020);
		System.out.println(result1);
		System.out.println(result2);
		
	}
}