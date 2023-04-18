package certification.tutorials.stream;

import java.util.Comparator;

public class CopmparatorTest {

	public static void main(String[] args) {
		
		Comparator<String> c5 = (var j, String k) -> 0;
		Comparator<String> c1 = ( j,  k) -> 0;
		Comparator<String> c2 = ( String j, String k) -> 0;
		Comparator<String> c4 = ( var j,  k) -> 0;
		Comparator<String> c5 = (var j, var k) -> 0;

	}

}
