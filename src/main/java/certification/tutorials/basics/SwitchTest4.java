package certification.tutorials.basics;

public class SwitchTest4 {

	public static void main(String[] args) {

		int i = 10;

		String message = switch (i) {
		case 10, 15 -> "i is ten or fifteen";

		case 20 -> {

			String str = "i is ";

			yield str + "twenty";
		}

		default -> throw new RuntimeException("Unexpected value: " + i);
		};
		System.out.println(message);
	}

}
