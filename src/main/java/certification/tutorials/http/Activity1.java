package certification.tutorials.http;

import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class Activity1 {

	public static void main(String[] args) {

		try {
			String path = "http://hc.apache.org";
			Document doc = Jsoup.connect(path).get();
			Elements elements = doc.select("div.section");

			for (Element div : elements) {

				for (Element childrenElement : div.children()) {
					String tag = childrenElement.tagName();

					if (tag.equalsIgnoreCase("h3")) {
						Elements links = childrenElement.getElementsByTag("a");
						for (Element link : links) {
							System.out.println(link.text());
						}
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
