package certification.tutorials;

public class Color {

	private int hue = 10;

	private enum Range {
		HIGH, LOW;
	}

	public class Shade {
		public int hue = Color.this.hue;
	}

	public static void main(String[] args) {
		System.out.println(new Shade().hue);

	}

}
