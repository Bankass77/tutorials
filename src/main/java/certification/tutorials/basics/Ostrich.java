package certification.tutorials.basics;

public class Ostrich {
	private String color;

	public Ostrich() {
		this("white");
	}

	public Ostrich(String color) {
		color = color;
	}

	public static void main(String[] args) {
		var o = new Ostrich();
		System.out.print("Color:" + o.color);
	}

}
