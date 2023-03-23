package certification.tutorials.string;

import java.io.PrintWriter;
import java.io.StringWriter;

public class MultilineDemo {

	public static void main(String[] args) {

		// This statement extracts the newline character specific to the
		// operating system
		String newLine = System.getProperty("line.separator");

		// method 1: simple concatenation using the '+' operator

		String multilineStr = "line one of the text block" + newLine + "line two of the text block" + newLine
				+ "last line of the text block";
		// or method 2 using `String#concat(..)` method
		multilineStr = "line one of the text block".concat(newLine).concat("line two of the text block").concat(newLine)
				.concat("last line of the text block");

		// or method 3 using `String.join` utility method
		multilineStr = String.join("line one of the text block", newLine, "line two of the text block", newLine,
				" last  line of the text block");

		// or method 4 using a StringBuffer instance

		multilineStr = new StringBuffer("line one of the text block").append(newLine)
				.append("last line of the text block").toString();
		// or method 5 using a StringBuilder instance
		multilineStr = new StringBuilder("line one of the text block ").append(newLine)
				.append("line two of the text block").append(newLine).toString();

		// or method 5 using a StringWriter instance

		StringWriter stringWriter = new StringWriter();

		stringWriter.write("line one of the text block");
		stringWriter.write(newLine);
		stringWriter.write("line two of the text block");
		stringWriter.write(newLine);
		stringWriter.write("last line of the text block");
		multilineStr = stringWriter.toString();

		// or method 6 using a StringWriter and PrintWriter instance

		stringWriter = new StringWriter();
		PrintWriter pt = new PrintWriter(stringWriter);
		pt.println("line one of the text block");
		pt.print("line two of the text block");
		pt.println("last line of the text block");
		multilineStr = pt.toString();
		System.out.println(multilineStr);

		System.out.println("--------------------------------------------");
		String multiLineStr = """

				line one of the text block
				line two of the text block
				last line of the text block

				""";
		System.out.println(multiLineStr);

		System.out.println("---------------------------------");

		String multiLineStr2 = """

				line one of the text block
				\n
				line two of the text block
				\n
				last line of the text block
				\n

				""";

		System.out.println(multiLineStr2);

		System.out.println("-----------------------------------");

		String multiLineStr3 = """

				line one of the text block\s
				line two of the text block\s
				last line of the text block\s

				""";

		System.out.println(multiLineStr3);

	}

}
