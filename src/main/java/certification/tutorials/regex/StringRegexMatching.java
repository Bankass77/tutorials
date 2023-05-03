package certification.tutorials.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexMatching {

	public static void main(String[] args) {
		
		String s= "Hello, Goodbye, Farewell";
		
		Pattern p = Pattern.compile("\\p{Alpha}+");
		Matcher m= p.matcher(s);
		
		while (m.find()) {
			System.out.println(m.group());
		}
		
		
		String s1= "Hello, Goodgye, Farewewell";
		
		String s2= "Hola, Adios, Hasta Luego";
		String myDelimiter= ", ";
		
		String [] s1Array= s1.split(myDelimiter);
		String [] s2Array= s2.split(myDelimiter);
		System.out.println("s1Array[0]:"+ s1Array[0]);
		System.out.println("s1Array[1]:"+ s1Array[1]);
		System.out.println("s1Array[2]:"+ s1Array[2]);
		
		System.out.println("s2Array[0]:"+ s2Array[0]);
		System.out.println("s2Array[0]:"+ s2Array[1]);
		System.out.println("s2Array[0]:"+ s2Array[2]);

	}

}
