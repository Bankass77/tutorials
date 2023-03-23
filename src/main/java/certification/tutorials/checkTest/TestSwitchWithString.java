package certification.tutorials.checkTest;

public class TestSwitchWithString {

	public static void main(String[] args) {

		String result = "Hello world";

		var result2 = switch (result) {
		case 1, 2: {

			yield "Good morning,";
		}
			;
		default:
			throw new IllegalArgumentException("Unexpected value: " + result);
		};

	}

}
