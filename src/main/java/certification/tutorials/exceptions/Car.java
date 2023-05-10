package certification.tutorials.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * First off, lines w1 and w2 compile without issue. On line w3, the multi-catch
 * block can contain two exceptions, provided they are not subtypes of each
 * other. Since one is a checked Exception and the other is an Error, line w3
 * compiles without issue. Line w4 contains a compilation error. Since
 * FileNotFoundException is a subclass of the already caught IOException, it is
 * not reachable on line w4
 *
 */
public class Car {
	public static void main(String[] s) throws Exception { // w2
		try {
			throw new IOException("Auto-pilot error");
		} catch (IOException | CarCrash e) { // w3
			throw e;
		} catch (FileNotFoundException a) { // w4
			throw a;
		}
	}

}
