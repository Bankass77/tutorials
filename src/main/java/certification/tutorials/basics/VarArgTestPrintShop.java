package certification.tutorials.basics;

import java.util.Arrays;

/**
 * 
 * From within a method, an array or varargs parameter is treated the same.
 * However, there is a difference from the caller’s point of view. A varargs
 * parameter can receive either an array or individual values, making lines 26
 * and 27 compile. However, an array parameter can take only an array, which
 * permits line 30 but prevents line 29 from compiling. Both lines 28 and 31
 * compile because null can be passed to a method taking an array or a vararg
 * parameter. Since there is only one line that doesn’t compile
 *
 */
public class VarArgTestPrintShop {
	public void printVarargs(String... names) {
		System.out.println(Arrays.toString(names));
	}

	public void printArray(String[] names) {
		System.out.println(Arrays.toString(names));
	}

	public void stormy() {
		printVarargs("Arlene");
		printVarargs(new String[] { "Bret" });
		printVarargs(null);
		printArray("Cindy");
		printArray(new String[] { "Don" });
		printArray(null);
	}
}
