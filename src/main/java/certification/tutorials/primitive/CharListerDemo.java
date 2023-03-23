package certification.tutorials.primitive;

public class CharListerDemo {

	public static void main(String... args) {

		for (int i = 0; i < 65536; ++i) {

			char c = (char) i;

			System.out.println("C[" + i + "]=" + c);

		}
	}

}
