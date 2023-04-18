package certification.tutorials.basics;

/**
 * 
 * The code does not compile.
 * The second case statement contains invalid syntax. Each case statement must
 * have the keyword case—in other words, you cannot chain them with a colon (:)
 * as shown in case 'B' : 'C' :.
. This line could have been fixed to say case 'B', 'C' or by adding the
 * case keyword before 'C'; then the rest of the code would have compiled and
 * printed great good at runtime.
 *
 */
public class SwitStementTest {

	public static void main(String[] args) {
		
		final char a = 'A', e = 'E';
		char grade = 'B';
		switch (grade) {
		   default:
		   case a:
		   case 'B': 'C': System.out.print("great ");
		   case 'D': System.out.print("good "); break;
		   case e:
		   case 'F': System.out.print("not good ");
		}


	}

}
