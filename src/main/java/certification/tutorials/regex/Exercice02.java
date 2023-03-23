package certification.tutorials.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercice02 {

	public static void main(String[] args) {

		String url = "https://www.packtpub.com/application-development/mastering-java-9";

		String regex = "(http[s])(?:://)([w]{0,3}\\.?[a-zA-Z]+\\.[a-zA-Z]{2,3})(?:[/])(.*)";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(url);
		boolean foundMatchers = matcher.find();

		if (foundMatchers) {

			String protocol = matcher.group(1);

			System.out.println("Protocol: " + protocol);

			String domain = matcher.group(2);
			System.out.println("domain: " + domain);

			String path = matcher.group(3);
			System.out.println("PATH: " + path);
		}
	}

}
