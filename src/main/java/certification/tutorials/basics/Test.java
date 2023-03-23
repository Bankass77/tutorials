package certification.tutorials.basics;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String...unused) {
		System.out.println("a");
		try (StringBuilder reader= new StringBuilder()) {
			System.out.println("b");
			throw new IllegalArgumentException();
		} catch (Exception e || RuntimeException e) {
			System.out.println("c");
			throw new FileNotFoundException();
		}finally {
			System.out.println("d");
		}

	}

}
