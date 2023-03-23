package certification.tutorials.recursion;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlTraverser {

	public Document loadXml() {

		Document document = null;

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {
			DocumentBuilder builder = dbf.newDocumentBuilder();
			File file = new File("src/main/resources/cities.xml");

			document = builder.parse(file);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return document;

	}

	// method to print node content
	// StringUtils class check if the text is blank
	public void printText(String text) {

		if (StringUtils.isNotBlank(text)) {
			System.out.println(text);
		}
	}

	// help to represent hiearchical nature of xml documents
	public void indent(int indentation) {
		System.out.println(StringUtils.leftPad("", indentation));
	}

	public void traverseNode(Node node, int indentation) {

		indent(indentation);

		System.out.println(node.getNodeName() + " ");

		if (node.hasChildNodes()) {

			indentation += 1;

			NodeList children = node.getChildNodes();

			for (int i = 0; i < children.getLength(); i++) {
				Node child = children.item(i);

				if (child.getNodeType() == Node.TEXT_NODE) {

					printText(child.getTextContent());

				} else {
					System.out.println();
					traverseNode(child, indentation);
				}
			}
		}
	}

	public void traverseDocument(Document document) {
		traverseNode(document.getFirstChild(), 0);
	}

	public static void main(String[] args) {

		XmlTraverser xmlTraverser = new XmlTraverser();
		Document document = xmlTraverser.loadXml();

		xmlTraverser.traverseDocument(document);

	}
}
