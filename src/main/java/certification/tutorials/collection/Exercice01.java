package certification.tutorials.collection;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice01 {

	public static void main(String[] args) {

		ArrayList<String> text = new ArrayList<String>();
		Console cons;
		String line = "";
		while (!line.equals("*") && (cons = System.console()) != null && (line = cons.readLine()) != null) {

			List<String> lineList = new ArrayList<String>(Arrays.asList(line.split(" ")));
			text.addAll(lineList);

		}
		System.out.println("You typed: " + text);

		System.out.println("Word count : " + text.size());
	}

}
