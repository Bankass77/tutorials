package certification.tutorials.http;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaDocLinks {

	public static void main(String[] args) {
		try {

			String path = "https://docs.oracle.com/en/java/javase/12/";

			Document doc = Jsoup.connect(path).get();

			Elements topics = doc.select("ul.topics");
			for (Element topic : topics) {
				for (Element listelement : topic.children()) {

					for (Element link : listelement.children()) {

						String url = link.attr("href");
						String text = link.text();

						System.out.println(url + " " + text);
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
