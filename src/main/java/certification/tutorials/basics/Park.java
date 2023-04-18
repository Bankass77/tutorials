package certification.tutorials.basics;

/**
 * 
 * First, determine whether the if statement’s expression is executed. The
 * expression 8 % 3 evaluates to 2. The right-hand side of the expression is
 * evaluated next, since + has a higher precedence than ˃. Since 2 ˃ 2 is false,
 * the expression triceratops++ is not called. Notice there are no braces, {},
 * in the if statement. Despite the triceratops-- line being indented, it is not
 * part of the if statement. Therefore, triceratops-- is always executed,
 * resulting in a value of 2 for triceratops
 *
 */
public class Park {
	public final static void main(String... arguments) {
		int pterodactyl = 8;
		long triceratops = 3;
		if (pterodactyl % 3 > 1 + 1)
			triceratops++;
		triceratops--;
		System.out.print(triceratops);
	}

}
