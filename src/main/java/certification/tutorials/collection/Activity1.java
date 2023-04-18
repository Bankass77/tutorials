package certification.tutorials.collection;

public class Activity1 {

	private static String[] text = { "So", "many", "books", "so", "little", "time" };

	private static String word;

	private static int occurence = -1;

	private static String searchQuery = "so";

	public static void main(String[] args) {

		countOccurence(text);
	}

	/**
	 * @param word2
	 * @return multiple Occurence of the word in array word2
	 */
	public static int countOccurence(String[] word2) {
		for (int i = 0; i < word2.length; i++) {
			word = word2[i];

			System.out.println("word: " + word);

			occurence = word2[i].compareToIgnoreCase(searchQuery);

			if (occurence == 0) {
				System.out.println("Found query at: " + i);
			}
		}
		return occurence;
	}

}
