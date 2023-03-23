package certification.tutorials.string;

public class ExampleStringMethods {

	public static void main(String[] args) {

		var name = "animals";

		System.out.println(name.substring(3)); // mals
		System.out.println(name.substring(name.indexOf('m'))); // mals

		System.out.println(name.substring(3, 4)); // m

		System.out.println(name.substring(3, 7)); // mals

		System.out.println(name.substring(3, 3)); // empty string
		// System.out.println(name.substring(3,2)); // Throw exception
		// java.lang.StringIndexOutOfBoundsException:
		// System.out.println(name.substring(3, 8)); // Throw a exception
		// java.lang.StringIndexOutOfBoundsException

		// Searching for Substrings

		System.out.println("abc".startsWith("a")); // true

		System.out.println("abc".startsWith("A")); // false

		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false

		System.out.println("abc".contains("A")); // false
		System.out.println("abc".contains("b")); // true

		// Replacing Values

		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc

		// Removing Whitespace

		System.out.println("abc".strip()); // abc

		System.out.println("\t  a b c\n".strip()); // a b c

		String text = " abc\t";

		System.out.println(text.trim().length()); // 3

		System.out.println(text.strip().length()); // 3

		System.out.println(text.stripLeading().length()); // 5
		System.out.println(text.stripTrailing().length()); // 4

		// Working with Indentation with String indent(int numberSpaces) and
		// StripIndent()

		var block = """
				a
				b
				c""";
		var concat = " a\n" + "  b\n" + " c";

		System.out.println("block lenght is: " + block.length()); // 6

		System.out.println("concat lenght is: " + concat.length()); // 9

		System.out.println(block.indent(1).length()); // 10

		System.out.println(concat.indent(-1).length()); // 7

		System.out.println(block.indent(-4).length()); // 6

		System.out.println("StripIndent method: " + concat.stripIndent());

		// Translating Escapes

		var str = "1\\t2";
		System.out.println(str); // 1\t2
		System.out.println(str.translateEscapes()); // 1 2

		// Translating Escapes

		System.out.println(str.isBlank());

		System.out.println(str.isEmpty());

		System.out.println(" ".isEmpty());
		System.out.println("".isEmpty());
		System.out.println(" ".isBlank());
		System.out.println("".isBlank());

		// Formatting Values

		var firstName = "Kate";
		var orderId = 5;

		// All print: Hello Kate, order 5 is ready

		System.out.println("Hello " + firstName + ", order " + orderId + " is ready");
		System.out.println(String.format("Hello %s, order %d is ready", firstName, orderId));
		var names = "James";
		var score = 90.25;
		var total = 100;

		System.out.println("%s:%n   Score:%f out of %d".formatted(names, score, total)); // This prints the following:
																							// James:
																							// Score: 90.250000 out of
																							// 100

		System.out.println("%s:%n   Score:%.1f out of %d".formatted(names, score, total));
		System.out.println("%s:%n   Score:%.3f out of %d".formatted(names, score, total));

		// var str1= "Food: %d tons".formatted(2.0); // IllegalFormatConversionException

		// System.out.println(str1);

		var pi = 3.14159265359;

		System.out.format("[%f]", pi); // [3,141593]
		System.out.format("[%12.8f]", pi); // [ 3,14159265]
		System.out.format("[%012f]", pi); // [00003,141593]
		System.out.format("[%12.2f]", pi); // [ 3,14]
		System.out.format("[%.3f]", pi); // [3,142]
		System.out.println("--------------------------------");
		// Method Chaining

		// Using the StringBuilder Class
		System.out.println("--------------------------------");
		String alpha = "";
		for (char current = 'a'; current <= 'z'; current++) {

			alpha += current;
		}
		System.out.println(alpha);

		System.out.println("--------------------------------");
		StringBuilder alBuilder = new StringBuilder();

		for (char current = 'a'; current <= 'z'; current++) {

			alBuilder.append(current);
			System.out.println(alBuilder);
		}

		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle"); // sb = "start+middle"
		System.out.println("sb:" + sb);
		StringBuilder same = sb.append("+end"); // start+middle+end
		System.out.println("same:" + same);

		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10);

		var sb4 = new StringBuilder("animals");
		String sub = sb4.substring(sb4.indexOf("a"), sb4.indexOf("al"));
		int len = sb4.length();
		char ch = sb4.charAt(6);

		System.out.println(sub + " " + len + " " + ch);
		var sb5 = new StringBuilder().append(1).append('c');
		sb5.append("-­").append(true);
		System.out.println(sb5);
		// 1c-­true

		// Inserting Data

		sb5.insert(7, "-");
		System.out.println(sb5); // 1c-­tru-e
		sb5.insert(0, "-­");
		System.out.println(sb5);
		sb.insert(6, "-­");
		System.out.println(sb5);

		var sb6 = new StringBuffer("abcdef");
		sb6.delete(1, 3);
		System.out.println(sb6);
		// sb6.deleteCharAt(5);
		// System.out.println(sb6);
		var sb7 = new StringBuilder("abcdef");
		sb7.delete(1, 100);
		System.out.println(sb7);

		// Replacing Portions

		var builder = new StringBuilder("pigeon dirty");
		builder.replace(3, 6, "sty");
		System.out.println(builder);

		builder.replace(3, 100, "");
		System.out.println(builder);

		var sb8 = new StringBuilder("ABC");
		System.out.println(sb8.reverse());
	}

}
