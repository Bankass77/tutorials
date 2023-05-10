package certification.tutorials.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Lines 23–26 do not compile because neither the class nor method defines a
 * generic type T. The declaration on lines 22 does not compile because ?
 * extends RuntimeException cannot be assigned a broader type. This leaves us
 * with two declarations that do compile.
 * Line 21 compiles, since any type of generic list can go in List˂?˃. The
 * declaration on lines 23 also compiles because ? super RuntimeException does
 * allow a broader exception type.
 *
 */
public class ListOfList {

	public void create() {
		
		List <?> n = new ArrayList<>();
		List<? extends RuntimeException> o= new ArrayList<Exception>();
		List<? super RuntimeException> p = new ArrayList<Exception>();
		List<T> q = new ArrayList<?>();
		List <T extends RuntimeException> r= new ArrayList<Exception>();
		List<T super RuntimeException> s= new ArrayList<Exception>();
	}

}
