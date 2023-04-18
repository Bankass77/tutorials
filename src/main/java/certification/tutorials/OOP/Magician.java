package certification.tutorials.OOP;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * The code compiles without issue. Even though tricks would be dropped in the
 * normalized path /bag/of/disappear.txt, there is no normalize() call, so
 * path.subpath(2,3) returns tricks on line 22. On line 23, the call to getName()
 * throws an IllegalArgumentException at runtime. Since getName() is
 * zero-indexed and contains only one element, the call on line 6 throws an
 * IllegalArgumentException. If getName(0)
 * had been used instead of getName(1), then the program would run without issue
 * and print /home/tricks.
 *
 */
public class Magician {

	public String doTrick(Path path) {

		return path.subpath(2, 3)
				.getName(1)
				.toAbsolutePath()
				.toString();
	}

	public static void main(String[] args) {

		final Magician m = new Magician();
		System.out.println(m.doTrick(Paths.get("/bag/of/tricks/../.disappaear.txt")));
	}
}
