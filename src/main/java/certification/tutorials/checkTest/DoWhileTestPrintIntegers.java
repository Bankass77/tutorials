package certification.tutorials.checkTest;

/**
 * 
 * Since the pre-increment operator was used, the first value that will be
 * displayed is -1. On the second-to-last
 * iteration of the loop, y will be incremented to 5, and the loop will output
 * 5. The loop will continue since 5 ˂= 5 is true, and on the last iteration, 6
 * will be output. At the end of this last iteration, the boolean expression 6
 * <= 5 will evaluate to false, and the loop will terminate. Since 6 was the
 * last value output by the loop
 *
 */
public class DoWhileTestPrintIntegers {

	public static void main(String[] args) {
		int y = -2;
		do
			System.out.print(++y + " ");
		while (y <= 5);

	}

}
