package certification.tutorials.nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * Line 21 does not modify the value of x because Path is immutable and x is not
 * reassigned to the new value. On line 22, the resolve() method is called using
 * y as the input argument. If the parameter passed to the resolve() method is
 * absolute, then that value is returned, causing the first println() method
 * call to output /dance/move.txt. On line 23, the absolute path is concatenated
 * with the relative path, printing /dance/move.txt/./song/../note at runtime. 
 *
 */
public class UseNormalizeWithResolveMethod {

	public static void main(String[] args) {
		Path x = Paths.get(".", "song", "..", "/note");
		Path y = Paths.get("/dance/move.txt");
		x.normalize();
		System.out.println(x.resolve(y));
		System.out.println(y.resolve(x));

	}

}
