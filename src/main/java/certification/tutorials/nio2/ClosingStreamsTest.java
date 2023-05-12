package certification.tutorials.nio2;

// print nothing
public class ClosingStreamsTest {

	public static void main(String[] args) {

		try (var out = System.out) {
		}
		;
		System.out.println("Hello");

		try (var err = System.err) {
		}
		;
		System.out.println("Hello");

	}

}
