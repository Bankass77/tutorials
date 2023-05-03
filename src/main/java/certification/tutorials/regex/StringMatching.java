package certification.tutorials.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatching {

	public static void main(String[] args) {
		
		// This will match a sequence of 1 or more uppercase and lowercase English letters as welll as spaces
		String myRegexString= "[a-zA-Z\\s]+";
		
		// This is a string we will check to see if our regex matches.
		
		String myString="The quick brown fox jumped over the lazy dog...";

		 // Create a Pattern object (compiled Regex) and save it as 'p
		
		Pattern p= Pattern.compile(myRegexString);
				
				// we need a Matcher to match our compiled Regex to a String
				
				Matcher m= p.matcher(myString);
		
		
		// if our Matcher find a match
		if (m.find()) {
			// Print true match
			System.out.println(m.group());
			
		}

	}

}
