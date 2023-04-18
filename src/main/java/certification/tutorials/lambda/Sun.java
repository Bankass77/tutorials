package certification.tutorials.lambda;

import java.util.function.UnaryOperator;

/**
 * 
 * A lambda expression can match multiple functional interfaces. It matches
 * with DoubleUnaryOperator, which takes a double value and returns a double value. Note that
 * the data type of s+1 is double because one of the operands, in this case s,
 * is double. It also matches Function<String, String> since the addition (+) operator can be
 * used for String concatenation. Finally, it matches with IntToLongFunction since the int
 * value s+1 can be implicitly cast to long. On the other hand, the lambda
 * expression is not compatible with UnaryOperator without a generic type. When
 * UnaryOperator is used without a generic argument, the type is assumed to be
 * Object. Since the addition operator is not defined on Object, the code does
 * not compile due to the lambda expression body,UnaryOperator the correct
 * answer.
 */
public class Sun {
	public static void dawn(UnaryOperator sunrise) {}

	public static void main(String[] rays) {
	      dawn(s -> s+1);
	   }

}
