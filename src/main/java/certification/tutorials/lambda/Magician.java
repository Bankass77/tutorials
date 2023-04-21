package certification.tutorials.lambda;

import java.util.function.BinaryOperator;

public class Magician {
	public void magic(BinaryOperator<Long> lambda) {
	      lambda.apply(3L, 7L);
	   }
	
	
	public static void main(String[] args) {
		
		Magician magician= new Magician();
		
	}
}
