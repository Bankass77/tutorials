package certification.tutorials.basics;

public class WhileLoopExempleWithBreak {

	public static void main(String[] args) {
		int i = 1;

		while (true) {/* Cannot exit the loop from here because it is true */

			if (i <= 10) {
				System.out.println(i);
				i++;
			} else {
				break;// Exit the loop
			}
		}
	}

}
