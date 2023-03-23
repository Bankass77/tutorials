package certification.tutorials.OOP;

public class WordTool {

	// Constructor
	public WordTool() {

	}

	// Method to count the words

	public int wordCount(String s) {

		int count = 0; // variable to count words
		// if entry is empty or is null , count is zero
		// therefore we evaluate it only otherwise
		if (!(s == null) || s.isEmpty()) {

			// use the split method from String class to
			// separate the words having the whitespace as separator
			String[] word = s.split("\\s+");
			count = word.length;
		}
		return count;
	}

	// Method to count the number of letters in a string

	public int symbolCount(String s, boolean whitespaces) {

		int count = 0;

		if (!(s == null) || s.isEmpty()) {

			if (whitespaces) {
				// with whitespace return full lengh
				count = s.length();
			} else {
				// Whithout whitespace, eliminate whitespaces
				// and get the lengh on the fly

				count = s.replace(" ", "").length();
			}

		}
		return count;
	}

	public static void main(String[] args) {

		WordTool wordTool = new WordTool();

		String text = "The river carried the memories from her childhood.";
		System.out.println("Analyzing the text: \n" + text);
		System.out.println("Total words: " + wordTool.wordCount(text));
		System.out.println("Total sysmbols(wo. spaces): " + wordTool.symbolCount(text, true));
		System.out.println("Total sysmbols(wo. spaces): " + wordTool.symbolCount(text, false));

	}

}
